import java.util.*;

public class AThresholdMovement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] w = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                w[i] = sc.nextInt();
            }

            if (n % 2 == 1) {
                System.out.println("NO");
                continue;
            }

            int maxEven = Integer.MIN_VALUE;
            int minOdd = Integer.MAX_VALUE;

            for (int i = 1; i <= n; i++) {
                if (i % 2 == 1)
                    minOdd = Math.min(minOdd, w[i]);
                else
                    maxEven = Math.max(maxEven, w[i]);
            }

            if (maxEven + 1 < minOdd)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}