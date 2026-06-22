import java.io.*;
import java.util.*;

public class BBalancedArray {

    static FastScanner fs = new FastScanner();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {

        int t = fs.nextInt();

        while (t-- > 0) {
            solve();
        }

    }

    static void solve() {
        int n = fs.nextInt();

        if (n % 4 != 0) {
            System.out.println("NO");
            return;
        }

        int k = n / 2;
        int oddsum = 0;
        int evensum = 0;

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= k; i++) {
            int val = 2 * i;
            evensum += val;
            sb.append(val).append(" ");
        }
        for (int i = 1; i < k; i++) {
            int val = 2 * i - 1;
            oddsum += val;
            sb.append(val).append(" ");
        }

        sb.append(evensum - oddsum);
        System.out.println("YES");

        System.out.println(sb.toString());
    }

    static class FastScanner {
        private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        private StringTokenizer st;

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        String nextLine() {
            try {
                return br.readLine();
            } catch (IOException e) {
                return "";
            }
        }
    }
}