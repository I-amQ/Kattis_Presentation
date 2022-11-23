package quang.excercises;

import java.util.Scanner;

public class railroad {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i = 0; i < T; i++){

            int N = sc.nextInt();
            int M = sc.nextInt();

            int[][] map = new int[N][N];

            for(int k = 0; k < N; k++){
                for(int s = 0; s < N; s++){
                    if(k == s) map[k][s] = 0;
                    else map[k][s] = -1;
                }
            }

            for(int j = 0; j < M; j++){

            }

        }

    }
}
