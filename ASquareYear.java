import java.io.*;
import java.util.*;

public class ASquareYear {

    static FastScanner fs = new FastScanner();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {

        // int t = 1;
        int t = fs.nextInt();

        while (t-- > 0) {
            solve();
        }

        // System.out.print(sb);
    }

    static void solve() {
        String str = fs.next();
        int year = 0;
        for (char c : str.toCharArray()) {
            year = year * 10 + (c - '0');
        }

        int num = (int) Math.sqrt(year);
        if (num * num == year) {
            int a = num / 2;
            int b = num - a;

            System.out.print(a + " ");
            System.out.println(b + " ");
        } else {
            System.out.println("-1");
        }

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