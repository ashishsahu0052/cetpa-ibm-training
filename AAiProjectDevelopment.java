import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AAiProjectDevelopment {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String line = br.readLine();
        if (line == null)
            return;
        int t = Integer.parseInt(line.trim());

        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            long x = Long.parseLong(st.nextToken());
            long y = Long.parseLong(st.nextToken());
            long z = Long.parseLong(st.nextToken());

            // --- Strategy 1: Without AI ---
            // Ceil division of n / (x + y)
            long timeWithoutAI = (n + (x + y) - 1) / (x + y);

            // --- Strategy 2: With AI ---
            long timeWithAI;
            long linesDuringSetup = z * x;

            if (linesDuringSetup >= n) {
                // Finishes before AI setup is even complete
                timeWithAI = (n + x - 1) / x;
            } else {
                // Setup completes, and they work together with boosted speed
                long remainingLines = n - linesDuringSetup;
                long combinedSpeedWithAI = x + 10 * y;
                long extraTime = (remainingLines + combinedSpeedWithAI - 1) / combinedSpeedWithAI;
                timeWithAI = z + extraTime;
            }

            // Take the optimal choice
            long minTime = Math.min(timeWithoutAI, timeWithAI);
            sb.append(minTime).append("\n");
        }

        System.out.print(sb.toString());
    }
}