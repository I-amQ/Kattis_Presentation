package quang.excercises;

import java.util.*;


public class ladder {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        double angl = sc.nextDouble();

        double length = h / Math.sin(angl*Math.PI/180) ;

        if (length == (int)length) System.out.println((int)length);
        else System.out.println((int)length + 1);

    }

}
