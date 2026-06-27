import java.io.*;
import java.util.*;

public class BCakeLeveling {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        StringBuilder out = new StringBuilder();

        while (t-- > 0) {

            int n = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());

            long sum = 0;
            long best = Long.MAX_VALUE;

            for (int i = 1; i <= n; i++) {

                long x = Long.parseLong(st.nextToken());

                sum += x;

                best = Math.min(best, sum / i);

                out.append(best).append(' ');
            }

            out.append('\n');
        }

        System.out.print(out);
    }
}