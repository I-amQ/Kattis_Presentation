import java.util.*;

class Animal{

    String type_name;
    int count = 1;

    public Animal(String type_name){
        this.type_name = type_name;
    }

}

public class zoo {
    public static void main(String[] args){

        Comparator<Animal> compare_by_name = new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.type_name.compareTo(o2.type_name);
            }
        };

        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Animal>> lists = new ArrayList<>();

        int n = -1;

        while(true){
            n = Integer.parseInt(sc.nextLine());

            if(n == 0) break;

            else{

                ArrayList<Animal> animal_types = new ArrayList<>();

                for(int i = 0; i < n; i++){

                    String info = sc.nextLine();
                    add_to(animal_types,info.substring(info.lastIndexOf(" ") + 1).toLowerCase(Locale.ROOT));
                }

                lists.add(animal_types);
            }
        }



        for(int i = 0; i < lists.size(); i++){

            System.out.println("List " + (i+1) + ":");
            Collections.sort(lists.get(i),compare_by_name);
            for(Animal animal : lists.get(i)){
                System.out.println(animal.type_name + " | " + animal.count );
            }
        }
    }


    public static void add_to(ArrayList<Animal> types_list, String animal_type){

        for(int i = 0; i < types_list.size(); i++){

            if(types_list.get(i).type_name.equals(animal_type)){
                types_list.get(i).count ++;
                return;
            }

        }
        types_list.add(new Animal(animal_type));

    }
}