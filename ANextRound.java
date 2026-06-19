import java.io.*;
import java.util.*;

public class ANextRound {

    static FastScanner fs = new FastScanner();
    static StringBuilder out = new StringBuilder();

    public static void main(String[] args) {

        // int t = 1;

        // Uncomment if multiple test cases
        int n = fs.nextInt();
        int k = fs.nextInt();

        int out = solve(n, k);

        System.out.print(out);
    }

    static int solve(int n, int k) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = fs.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= arr[k - 1]) {
                if (arr[i] > 0) {
                    count++;

                }

            } else {
                continue;
            }
        }
        return count;
    }

    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

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
    }
}