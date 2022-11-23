package quang.excercises;

import java.util.Scanner;
import java.util.Vector;

public class leftbeehind {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Vector<String> results = new Vector<>();
        int sweet = sc.nextInt();
        int sour = sc.nextInt();

        while(sweet + sour != 0){
            if(sweet + sour == 13) results.add("Never speak again.");
            else{
                if(sweet > sour) results.add("To the convention.");
                else if (sour > sweet) results.add("Left beehind.");
                else results.add("Undecided.");
            }
            sweet = sc.nextInt();
            sour = sc.nextInt();
        }

        for(String result : results){
            System.out.println(result);
        }

    }
}
