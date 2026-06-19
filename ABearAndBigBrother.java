import java.io.*;
import java.util.*;

public class ABearAndBigBrother {

    static FastScanner fs = new FastScanner();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {

        int n = solve();

        System.out.print(n);
    }

    static int solve() {
        int a = fs.nextInt();
        int b = fs.nextInt();
        int count = 0;

        while (a <= b) {
            a *= 3;
            b *= 2;
            count++;
        }
        return count;
    }

    static class FastScanner {
        private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        private StringTokenizer st;

        String next() {
            while (st == null || !st.hasMoreElements()) {
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