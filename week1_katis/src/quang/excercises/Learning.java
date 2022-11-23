package quang.excercises;

import java.util.Scanner;
import java.util.Vector;

public class Learning {

    public static void main(String[] strings){

        int result = 0;

        Scanner sc = new Scanner(System.in);

        Vector<Integer> vector = new Vector<>();

        int num = Integer.parseInt(sc.nextLine());

        while(vector.size() < num){
            vector.add(Integer.parseInt(sc.next()));
        }

        for (int i = 0; i < vector.size(); i++){
            if (vector.get(i) < 0) result ++;
        }

        System.out.println(result);


    }
}
