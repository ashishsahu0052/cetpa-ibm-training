import java.io.*;
import java.util.*;

public class AGamesOnTheTrain {

    static FastScanner fs = new FastScanner();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {

        // int t = 1;
        int t = fs.nextInt();

        while (t-- > 0) {
            solve();
        }

        // System.out.print(n);
    }

    static void solve() {
        int n = fs.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int a = fs.nextInt();

            if (a < min) {
                min = a;
            }
            if (a > max) {
                max = a;
            }

        }
        System.out.println(" " + (max - min + 1));
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