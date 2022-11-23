package quang.excercises;

import java.util.Scanner;

public class justaminute {

    public static void main(String[] strings){


        Scanner sc = new Scanner(System.in);

        double result = 0;
        int expected= 0;
        double real =0 ;
        double N = sc.nextInt();

        for (int i = 0; i < N; i++){
            expected += sc.nextInt() * 60;
            real += sc.nextInt();
        }

        result = real/expected;

        if(result > 1) {
            System.out.println(result);
        }else System.out.println("measurement error");

    }

}
