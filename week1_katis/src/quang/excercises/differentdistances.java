package quang.excercises;

import java.util.Scanner;
import java.util.Vector;

public class differentdistances {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Vector<Double> results = new Vector<>();

        while (true) {

            String data = sc.nextLine();
            if (data.length() == 1) break;
            String[] tokens = data.split(" ");
            double x1 = Double.parseDouble(tokens[0]);
            double y1 = Double.parseDouble(tokens[1]);
            double x2 = Double.parseDouble(tokens[2]);
            double y2 = Double.parseDouble(tokens[3]);
            double p = Double.parseDouble(tokens[4]);

            results.add(Math.pow(Math.pow(Math.abs(x1 - x2), p) + Math.pow(Math.abs(y1 - y2), p), 1 / p));

        }

        for (int i= 0; i < results.size(); i++) {
            System.out.println(results.get(i));
        }
    }
}
