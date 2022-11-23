package quang.excercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;
import java.util.Scanner;

public class bijele {

    public static void main(String[] args){

        Vector<Integer> vector = new Vector<Integer>();

        int[] arr = new int[]{1,1,2,2,2,8};

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 6; i++){
            vector.add(sc.nextInt());
        }

        for (int i = 0; i < 6; i++){
            System.out.print( arr[i] - vector.get(i)  + " ");
        }

    }

}
