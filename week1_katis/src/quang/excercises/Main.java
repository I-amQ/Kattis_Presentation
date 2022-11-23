package quang.excercises;

public class Main { // given a = 1 as per requested.

    public static void main(String[] args) {
        double b = Double.parseDouble(args[0]);
        double c = Double.parseDouble(args[1]);

        double discriminant = b*b - 4.0*c;

        if(discriminant < 0) {
            double sqrt = Math.sqrt(-discriminant);
            System.out.printf("root 1: %f + %fi\n", -b / 2, sqrt / 2);
            System.out.printf("root 2: %f + %fi\n", -b / 2, -sqrt / 2);
        }
        else {
            double sqrt = Math.sqrt(discriminant);
            System.out.printf("root 1: %f\n", -b / 2 + sqrt / 2);
            System.out.printf("root 2: %f\n", -b / 2 - sqrt / 2);
        }
    }
}
