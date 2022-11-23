package quang.excercises;

import java.util.Scanner;

public class nastyhacks {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n > 0) {
            int[] result = new int[n];

            for (int i = 0; i < n; i++){

                int rev_no_ad = sc.nextInt();
                int rev_with_ad = sc.nextInt();
                int ad_fee = sc.nextInt();

                result[i] = rev_with_ad - rev_no_ad - ad_fee;

            }

            for ( int res : result){
                if(res > 0) System.out.println("advertise");
                else if(res == 0) System.out.println("does not matter");
                else System.out.println("do not advertise");
            }
        }
    }
}
