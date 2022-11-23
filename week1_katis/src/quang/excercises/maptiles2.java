package quang.excercises;

import java.util.*;

public class maptiles2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> vector = new Vector<Integer>();
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            int digit = Character.getNumericValue(str.charAt(i));
            vector.add(digit);
        }

        int zoom_level = str.length();

        int side_length = (int)Math.pow(2,zoom_level);

        int x = 0;
        int y = 0;

        int iter = 0;
        while(iter < zoom_level){

            int diff = side_length/2;

            if (vector.get(iter) == 1){
                x += diff;
            }

            else if (vector.get(iter) == 2){
                y += diff;
            }

            else if (vector.get(iter) == 3){
                x += diff;
                y += diff;
            }

            iter++;
            side_length /= 2;

        }

        System.out.println(zoom_level + " " + x + " " + y);
    }
}
