package quang.excercises;

import java.util.Scanner;
import java.util.BitSet;

public class primesieve {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();


        int[] array = new int[q];
        for(int j = 0; j < q;j++){
            array[j] = sc.nextInt();
        }

        int count = primeCountUpTo(n);

        System.out.println(count);

        for(int j = 0; j < q; j++){
            if(isPrime(array[j])) System.out.println(1);
            else System.out.println(0);
        }

    }

    static boolean isPrime(int n)
    {
        if(n<=1) return false;
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    static int primeCountUpTo(int n){
        BitSet A = new BitSet();
        A.set(2,n+1,true);
        for(int i = 2; i * i <= n; i++){
            if(A.get(i)) for(int j = i*i; j <= n; j += i ){
                A.set(j,false);
            }
        }

        int res=0;
        for(int i = 2; i <= n; i++){
            if(A.get(i)) res++;
        }
        return res;
    }
}