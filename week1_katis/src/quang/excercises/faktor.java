package quang.excercises;

import java.util.Scanner;

public class faktor {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double num_articles = sc.nextInt();
        int impact_faktor = sc.nextInt();

        int bribes = (int)(num_articles * (impact_faktor-1));

        bribes ++;

        System.out.println(bribes);

    }

}
