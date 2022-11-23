package quang.excercises;

import java.util.Scanner;
import java.util.Vector;

public class mancala {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        Vector<Results> result = new Vector<>();

        while ( P-- > 0 ){
            int[] board = new int[1000];
            int set_num = sc.nextInt();
            int counters = sc.nextInt();
            int max_plot_reached = 0;
            while( counters-- > 0) {
                for (int i = 1; i <= board.length; i++) {
                    max_plot_reached = Math.max(i, max_plot_reached);
                    if (board[i] == 0) {
                        board[i] = i;
                        break;
                    } else {
                        board[i]--;
                    }
                }
            }
            result.add(new Results(board,max_plot_reached,set_num));
        }

        for(int k = 0; k < result.size(); k++){
            System.out.println(k + 1 + " " + result.get(k).max_plot_reached);
            for(int i = 1; i <= result.get(k).max_plot_reached; i++){
                System.out.print(result.get(k).board[i] + " ");

                if(i % 10 == 0 && i != result.get(k).max_plot_reached) System.out.print("\n");
            }
            System.out.println();
        }

    }
}

class Results{
    public int[] board;
    public int max_plot_reached;
    public int set_num;

    public Results(int[] board, int max_plot_reached, int set_num){
        this.board = board;
        this.max_plot_reached = max_plot_reached;
        this.set_num = set_num;
    }
}
