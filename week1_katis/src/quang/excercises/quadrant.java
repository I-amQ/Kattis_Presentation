package quang.excercises;

import java.util.Scanner;

public class quadrant {

    public static void main(String[] strings){


        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x > 0){

            if(y > 0) System.out.println(1);
            else if (y < 0) System.out.println(4);
        }
        else if(x < 0){
            if (y > 0) System.out.println(2);
            if (y < 0) System.out.println(3);
        }
    }
}
