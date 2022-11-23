package quang.excercises;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class musicalscales {

    public static void main(String[] args){

        HashMap<String, Integer> notes_map = new HashMap<>();
        notes_map.put("A",0);
        notes_map.put("A#",1);
        notes_map.put("B",2);
        notes_map.put("C",3);
        notes_map.put("C#",4);
        notes_map.put("D",5);
        notes_map.put("D#",6);
        notes_map.put("E",7);
        notes_map.put("F",8);
        notes_map.put("F#",9);
        notes_map.put("G",10);
        notes_map.put("G#",11);

        String[] notes_array = {"A","A#","B","C","C#","D","D#","E","F","F#","G","G#"};

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> scale_candidates = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));

        for(int i = 0; i < n; i++){
            int note_num = notes_map.get(sc.next());
            scale_candidates.removeIf(scale -> !check_in_scale(scale,note_num));
        }

        if(scale_candidates.size() == 0) System.out.println("none");
        else{
            for(int j : scale_candidates){
                System.out.print(notes_array[j] + " ");
            }
        }
    }

    static boolean check_in_scale(int scale,int note){
        int diff = note - scale;
        return diff == 0 || diff == 2 || diff == 4 || diff == 5 || diff == 7 || diff == 9 || diff == 11
                || diff == -1 || diff == -3 || diff == -5 || diff == -7 || diff == -8 || diff == -10;
    }
}
