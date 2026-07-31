import java.util.*;

public class ATram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int curr = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            curr -= a;
            curr += b;

            max = Math.max(max, curr);
        }

        System.out.println(max);
    }
}