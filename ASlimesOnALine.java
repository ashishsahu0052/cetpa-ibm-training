import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ASlimesOnALine {
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

            int maxVal = Integer.MIN_VALUE;
            int minVal = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                int val = Integer.parseInt(st.nextToken());
                if (val > maxVal)
                    maxVal = val;
                if (val < minVal)
                    minVal = val;
            }

            int diff = maxVal - minVal;
            // Ceil division of diff / 2
            int ans = (diff + 1) / 2;

            sb.append(ans).append("\n");
        }

        System.out.print(sb.toString());
    }
}