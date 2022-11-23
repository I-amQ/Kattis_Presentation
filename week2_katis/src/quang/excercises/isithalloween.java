package quang.excercises;

import java.util.Objects;
import java.util.Scanner;

public class isithalloween {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        if (Objects.equals(str, "OCT 31") || Objects.equals(str, "DEC 25")) System.out.println("yup");

        else System.out.println("nope");

    }
}
