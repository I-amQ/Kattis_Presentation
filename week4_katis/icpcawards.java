import java.util.ArrayList;
import java.util.Scanner;

class Team{
    String uni;
    String name;

    public Team(String uni_name, String team_name){
        this.uni = uni_name;
        this.name = team_name;
    }
}

public class icpcawards {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ArrayList<Team> winners = new ArrayList<>();

        int N = sc.nextInt();
        String uni_name;
        String team_name;
        for(int i = 0; i < N; i++){

            uni_name = sc.next();
            team_name = sc.next();

            add_team(winners,new Team(uni_name,team_name));
            if(winners.size() == 12) break;
        }

        for(Team winner : winners){
            System.out.println(winner.uni + " " + winner.name);
        }
    }

    public static void add_team(ArrayList<Team> teams, Team input_team){

        for(Team team:teams){
            if(team.uni.equals(input_team.uni)) return;
        }
        teams.add(input_team);
    }
}