import java.util.ArrayList;
import java.util.Scanner;

class Person{
    String name;
    Boolean in_building;

    public Person(String person_name, Boolean in_building){
        this.name = person_name;
        this.in_building = in_building;
    }
}

public class securedoors {

    static ArrayList<Person> persons = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StringBuilder res = new StringBuilder();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String action = sc.next();
            String person_name = sc.next();
            res.append(log(person_name, action));
        }

        System.out.print(res);
    }

    public static String log(String person_name, String person_action) {
        if (!persons.isEmpty()) {
            for (Person person : persons) {
                if (person.name.equals(person_name)) {
                    if (person_action.equals("entry")) {
                        if (person.in_building) {
                            return person_name + " entered (ANOMALY)\n";
                        } else {
                            person.in_building = true;
                            return person_name + " entered\n";
                        }
                    } else {
                        if (person.in_building) {
                            person.in_building = false;
                            return person_name + " exited\n";
                        } else {
                            return person_name + " exited (ANOMALY)\n";
                        }
                    }
                }
            }
        }

        Boolean in_building = person_action.equals("entry");
        Person new_person = new Person(person_name, in_building);
        persons.add(new_person);
        if (in_building) return person_name + " entered\n";
        else return person_name + " exited (ANOMALY)\n";
    }
}