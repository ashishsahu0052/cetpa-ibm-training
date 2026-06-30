import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ADestroyingTowers {
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

            long totalSum = 0;

            // Process each tower from left to right
            for (int j = 0; j < n; j++) {
                int minValidHeight = a[j];

                // Look at all towers to its left
                for (int i = 0; i < j; i++) {
                    if (a[i] <= a[j]) {
                        minValidHeight = Math.min(minValidHeight, a[i]);
                    }
                }

                totalSum += minValidHeight;
            }

            sb.append(totalSum).append("\n");
        }

        System.out.print(sb.toString());
    }
}