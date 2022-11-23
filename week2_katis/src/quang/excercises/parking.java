package quang.excercises;

import java.util.Scanner;

public class parking {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int[] times = new int[100];
        int price = 0;

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();


        for(int i = 0; i < 3; i++){
            int arr = sc.nextInt();
            int dep = sc.nextInt();

            for(int j = arr; j < dep; j++){

                times[j] = times[j] + 1;

            }
        }

        for (int time : times){
            if(time == 0) continue;
            else if(time == 1) price += A * time;
            else if(time == 2) price += B * time;
            else if(time == 3) price += C * time;
        }


        System.out.println(price);
    }
}

