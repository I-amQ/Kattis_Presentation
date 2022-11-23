package quang.excercises;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class eligibility {

    public static void main(String[] args) throws ParseException {

            Scanner sc = new Scanner(System.in);

            int n = Integer.parseInt(sc.nextLine());

            String[] name_vec = new String[n];
            Date[] school_date_vec = new Date[n];
            Date[] birth_date_vec = new Date[n];
            Integer[] num_semesters = new Integer[n];
            String[] eligibility = new String[n];

            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

            for (int i = 0; i < n; i++){
                String info = sc.nextLine();
                String[] tokens = info.split(" ");

                name_vec[i] = tokens[0];
                school_date_vec[i] = dateFormat.parse(tokens[1]);
                birth_date_vec[i] = dateFormat.parse(tokens[2]);
                num_semesters[i] = Integer.parseInt(tokens[3]);


                if(school_date_vec[i].getYear() + 1900 >= 2010) eligibility[i] = "eligible";
                else if(birth_date_vec[i].getYear() + 1900 >= 1991) eligibility[i] = "eligible";
                else if(num_semesters[i] > 40) eligibility[i] = "ineligible";
                else eligibility[i] = "coach petitions";
            }

            for (int j = 0; j < n; j++){
                System.out.println(name_vec[j] + " " + eligibility[j] );
            }
    }

}
