import java.io.*;
import java.util.*;

public class AWeNeedTheZero {

    static FastScanner fs = new FastScanner();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {

        // int t = 1;
        int t = fs.nextInt();

        while (t-- > 0) {
            int n = solve();
            System.out.println(n);
        }

    }

    static int solve() {
        int n = fs.nextInt();
        int xor = 0;

        // int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            xor ^= fs.nextInt();

        }
        if (n % 2 == 1) {
            return xor;
        }
        if (xor == 0) {
            return 0;

        }

        return -1;

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