import java.io.*;

public class BPalindromeTwelveAndTwoTerms {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            long n = Long.parseLong(br.readLine());

            if (n == 10) {
                System.out.println(-1);
                continue;
            }

            long rem = n % 12;
            long a;

            if (rem <= 9) {
                a = rem;
            } else if (rem == 10) {
                a = 22;
            } else { // rem == 11
                a = 11;
            }

            System.out.println(a + " " + (n - a));
        }
    }
}