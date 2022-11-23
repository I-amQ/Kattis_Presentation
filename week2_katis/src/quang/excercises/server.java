package quang.excercises;

import java.util.Scanner;

public class server {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int T = sc.nextInt();

        int result = 0;

        for(int i = 0; i < n; i++){
            T -= sc.nextInt();
            if(T >= 0) result++;
            else break;
        }

        System.out.println(result);

    }
}
