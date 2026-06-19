import java.io.*;
import java.util.*;

public class ABit {

    static FastScanner fs = new FastScanner();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {

        solve();

        System.out.print(sb);
    }

    static void solve() {
        int n = fs.nextInt();
        int x = 0;
        while (n-- > 0) {
            String s = fs.next();

            if (s.contains("++")) {
                x++;
            } else {
                x--;
            }
        }

        sb.append(x).append('\n');
    }

    static class FastScanner {
        private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        private StringTokenizer st;

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
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