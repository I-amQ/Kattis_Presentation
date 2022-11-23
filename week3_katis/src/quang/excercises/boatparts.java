package quang.excercises;

import java.util.Scanner;
import static java.lang.System.exit;

public class boatparts {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int P = sc.nextInt();
        if(P == 1){
            System.out.println(1);
        }
        else {
            int N = sc.nextInt();
            sc.nextLine();

            String[] fixed_parts = new String[P];
            fixed_parts[0] = sc.nextLine();

            int collected = 1;
            int day = 1;

            while(day < N) {
                String fetched = sc.nextLine();
                for (int j = 0; j < collected; j++) {
                    if (fetched.equals(fixed_parts[j])) break;
                    else if (j == collected - 1) {
                        if (collected == P - 1) {
                            System.out.println(day+1);
                            exit(0);
                        }
                        fixed_parts[collected] = fetched;
                        collected++;
                    }
                }
                day++;
            }

            System.out.println("paradox avoided");
        }
    }
}

