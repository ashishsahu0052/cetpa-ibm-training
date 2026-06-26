import java.io.*;
import java.util.*;

public class AEuclidSequenceAndTwoNumbers {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            Integer[] a = new Integer[n];
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(a, Collections.reverseOrder());

            if (n == 2) {
                System.out.println(a[0] + " " + a[1]);
                continue;
            }

            boolean ok = true;

            // Sequence must be strictly decreasing
            for (int i = 0; i < n - 1; i++) {
                if (a[i] <= a[i + 1]) {
                    ok = false;
                    break;
                }
            }

            // Check Euclid sequence property
            if (ok) {
                for (int i = 0; i < n - 2; i++) {
                    if (a[i] % a[i + 1] != a[i + 2]) {
                        ok = false;
                        break;
                    }
                }
            }

            if (ok)
                System.out.println(a[0] + " " + a[1]);
            else
                System.out.println(-1);
        }
    }
}