package quang.excercises;

import java.util.Scanner;

public class jewelrybox {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        double[] result = new double[T];

        for(int i = 0; i < T; i++) {
            double X = sc.nextInt();
            double Y = sc.nextInt();

            double deviration_a = 12;
            double deviration_b = -4*(Y+X);
            double deviration_c = X*Y;

            double d = deviration_b*deviration_b - 4*deviration_a*deviration_c;

            if(d > 0.0) {
                double r1 = (-deviration_b + Math.pow(d, 0.5)) / (2.0 * deviration_a);
                double r2 = (-deviration_b - Math.pow(d, 0.5)) / (2.0 * deviration_a);

                double v1 = (X - 2*r1) * (Y - 2*r1) * r1;
                double v2 = (X - 2*r2) * (Y - 2*r2) * r2;

                if(v1 > v2) result[i] = v1;
                else result[i] = v2;
            }
            else{
                double r = -deviration_b/(2*deviration_a);
                result[i] = r;
            }

            // there is no way that d is smaller than 0 given positive int x and y
            // do this with mathematical proof.

        }

        for (double res : result){
            System.out.println(res);
        }
    }
}
