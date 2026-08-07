import java.util.*;

public class ALineTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int max = a[0]; // distance from 0 to first station

            // Maximum distance between gas stations
            for (int i = 1; i < n; i++) {
                max = Math.max(max, a[i] - a[i - 1]);
            }

            // No station at x, so we need to go to x and come back
            int lastDistance = 2 * (x - a[n - 1]);

            max = Math.max(max, lastDistance);

            System.out.println(max);
        }
    }
}