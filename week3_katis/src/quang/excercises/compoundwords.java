package quang.excercises;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class compoundwords {


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Vector<String> words = new Vector<>();
        Vector<String> newWords = new Vector<>();
        while(sc.hasNext()){
            String s = sc.next();
            if(s.equals("s"))break;
            words.add(s);
        }
        for(String s : words){
            for(String st :words){
                if(!s.equals(st)) if(!newWords.contains(s+st))newWords.add(s+st);
            }
        }
        Collections.sort(newWords);
        for(String s:newWords)System.out.println(s);
    }
}
