import java.util.*;

class Items{
   String name;
   ArrayList<String> customer = new ArrayList<>();

   public Items(String item_name, String customer_name){
       this.name = item_name;
       this.customer.add(customer_name);
   }

}

public class baconeggsandspam {

    static Comparator<Items> compare_by_name = Comparator.comparing(o -> o.name);

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Items>> logs = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n > 0){
            ArrayList<Items> today_log = new ArrayList<>();
            for(int i = 0; i < n; i++) {

                String[] info = sc.nextLine().split(" ");
                String customer_name = info[0];
                for (int k = 1; k < info.length; k++){
                    String item_name = info[k];
                    add_item(today_log,item_name,customer_name);
                }

            }
            logs.add(today_log);
            n = Integer.parseInt(sc.nextLine());
        }

        for (ArrayList<Items> log : logs) {

            log.sort(compare_by_name);
            for(Items item : log){
                Collections.sort(item.customer);
                System.out.println(item.name + " " + item.customer.toString().replaceAll("[^\\w\\s]",""));
            }

            System.out.println();
        }

    }

    public static void add_item(ArrayList<Items> items_list, String item_name, String customer_name){

        if(!items_list.isEmpty()) {
            for (Items item : items_list) {
                if (item.name.equals(item_name)) {
                    item.customer.add(customer_name);
                    return;
                }
            }
            items_list.add(new Items(item_name,customer_name));

        }else items_list.add(new Items(item_name,customer_name));
    }
}