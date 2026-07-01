import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AOptimalPurchase {
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
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());

            // Calculate how many full groups of 3 we can form
            long fullGroups = n / 3;
            long remainder = n % 3;

            // Cost for the blocks of 3 students
            long costForGroups = fullGroups * Math.min(3 * a, b);

            // Cost for the remaining students
            long costForRemainder = 0;
            if (remainder == 1) {
                costForRemainder = Math.min(a, b);
            } else if (remainder == 2) {
                costForRemainder = Math.min(2 * a, b);
            }

            long totalCost = costForGroups + costForRemainder;
            sb.append(totalCost).append("\n");
        }

        System.out.print(sb.toString());
    }
}