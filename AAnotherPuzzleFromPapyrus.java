import java.io.*;
import java.util.*;

public class AAnotherPuzzleFromPapyrus {

    static FastScanner fs = new FastScanner();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {

        int t = fs.nextInt();

        while (t-- > 0) {
            solve();
        }

        // System.out.print(sb);
    }

    static void solve() {
        int n = fs.nextInt();
        int c = fs.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int count = 0;
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            a[i] = fs.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = fs.nextInt();
        }

        boolean possible = true;

        for (int i = 0; i < n; i++) {
            if (a[i] < b[i]) {
                possible = false;
                break;
            }
            count += a[i] - b[i];
        }

        if (possible) {
            ans = Math.min(ans, count);
        }

        // with reordering

        int sa[] = a.clone();
        int sb[] = b.clone();

        Arrays.sort(sa);
        Arrays.sort(sb);
        possible = true;
        count = c;

        for (int i = 0; i < n; i++) {
            if (sa[i] < sb[i]) {
                possible = false;
                break;
            }
            count += a[i] - b[i];
        }

        if (possible) {

            ans = Math.min(ans, count);
        }

        if (ans == Integer.MAX_VALUE) {
            System.out.println("-1");
        } else {
            System.out.println(ans);
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