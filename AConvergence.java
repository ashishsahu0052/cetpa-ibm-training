import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class AConvergence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String line = br.readLine();
        if (line == null)
            return;
        int t = Integer.parseInt(line.trim());

        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            st = new StringTokenizer(br.readLine());

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            // Step 1: Sort the array to easily calculate counts
            Arrays.sort(a);

            int minCalls = Integer.MAX_VALUE;

            // Step 2: Evaluate each element as a potential meeting destination X
            for (int i = 0; i < n; i++) {
                // Skip duplicate values to avoid redundant calculations
                if (i > 0 && a[i] == a[i - 1]) {
                    continue;
                }

                int target = a[i];
                int L = 0;
                int R = 0;

                // Count how many friends are strictly to the left or right of target X
                for (int j = 0; j < n; j++) {
                    if (a[j] < target) {
                        L++;
                    } else if (a[j] > target) {
                        R++;
                    }
                }

                // The cost for this target is max(L, R)
                int currentCalls = Math.max(L, R);
                minCalls = Math.min(minCalls, currentCalls);
            }

            sb.append(minCalls).append("\n");
        }

        // Print all outputs at once for fast I/O performance
        System.out.print(sb.toString());
    }
}