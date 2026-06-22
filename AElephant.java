import java.io.*;
import java.util.*;

public class AElephant {

    static FastScanner fs = new FastScanner();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {

        solve();
    }

    static void solve() {
        int n = fs.nextInt();
        int steps = 0;
        while (n > 0) {
            if (n > 4) {
                n = n - 5;
            } else if (n > 3) {
                n = n - 4;
            } else if (n > 2) {
                n = n - 3;
            } else if (n > 1) {
                n = n - 2;
            } else {
                n = n - 1;
            }
            steps++;

        }
        System.out.println(steps);

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