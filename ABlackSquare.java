import java.io.*;
import java.util.*;

public class ABlackSquare {

    static FastScanner fs = new FastScanner();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {

        // int t = 1;
        // // t = fs.nextInt();

        // while (t-- > 0) {
        solve();
        // }

        System.out.print(sb);
    }

    static void solve() {
        int count = 0;
        int[] arr = new int[5];
        for (int i = 1; i < 5; i++) {
            arr[i] = fs.nextInt();
        }
        String s = fs.next();

        for (char i : s.toCharArray()) {
            int n = Character.getNumericValue(i);

            count += arr[n];
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