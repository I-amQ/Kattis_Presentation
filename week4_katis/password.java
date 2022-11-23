import java.util.*;

public class password {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] percentage = new double[n];
        for(int i = 0; i < n; i++) {
            sc.next();
            percentage[i] = sc.nextDouble();
        }
        Arrays.sort(percentage);
        int attempt = 1;
        double res = 0;
        for(int i = n - 1; i >= 0; i--) {
            res += attempt * percentage[i];
            attempt++;
        }

        System.out.println(res);
    }
}