package quang.excercises;

import java.util.Scanner;

public class grassseed {

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        double result = 0;

        double C = sc.nextDouble();

        int L = sc.nextInt();

        for(int i = 0; i < L; i++){

            result += sc.nextDouble() * sc.nextDouble();

        }

        System.out.println(result * C);
    }
}

