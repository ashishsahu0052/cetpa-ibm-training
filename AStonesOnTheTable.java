import java.io.*;
import java.util.*;

public class AStonesOnTheTable {

    static FastScanner fs = new FastScanner();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {

        // int t = 1;
        // // t = fs.nextInt();

        // while (t-- > 0) {
        // solve();
        // }
        solve();

        // System.out.print(sb);
    }

    static void solve() {
        int n = fs.nextInt();
        String s = fs.next();
        Stack<Character> stack = new Stack<>();

        int count = 0;
        stack.add(s.charAt(0));

        for (int i = 1; i < n; i++) {
            if (stack.peek() == s.charAt(i)) {
                count++;
            } else {
                stack.add(s.charAt(i));
            }
        }
        System.out.println(count);

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