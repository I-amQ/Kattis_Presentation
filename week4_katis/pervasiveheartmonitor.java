import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Customer{

    String name;
    Double result;

    Customer(String name, Double result){
        this.name = name;
        this.result = result;
    }

}

public class pervasiveheartmonitor {

    static ArrayList<Customer> customers_list = new ArrayList<>();

    public static int indexOf(Pattern pattern, String s) {
        Matcher matcher = pattern.matcher(s);
        return matcher.find() ? matcher.start() : -1;
    }

    public static void main(String[] args){

        InputStreamReader instream = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(instream);
        ArrayList<Customer> customers = new ArrayList<>();


        while (true) {

            try {
                String info = buffer.readLine();

                if(info == null || info.isEmpty()) break;

                boolean name_first = true;

                int seperate_index = indexOf(Pattern.compile("\\d*\\.\\d"), info);

                if (seperate_index == 0) {
                    name_first = false;
                    seperate_index = indexOf(Pattern.compile("[a-zA-Z]"), info);
                }

                String first_segment = info.substring(0, seperate_index);
                String second_segment = info.substring(seperate_index);

                String name;
                String record;
                double sum = 0;
                double counter = 0;

                if (name_first) {
                    name = first_segment;
                    record = second_segment;
                } else {
                    name = second_segment;
                    record = first_segment;
                }

                Scanner text_scanner = new Scanner(record);

                while (text_scanner.hasNextDouble()) {
                    sum += text_scanner.nextDouble();
                    counter++;
                }

                customers.add(new Customer(name, sum / counter));


            } catch (IOException e) {
                break;
            }
        }
        for (int i = 0; i < customers.size(); i++) {
                System.out.println(customers.get(i).result + " " + customers.get(i).name);
        }

   }
}

