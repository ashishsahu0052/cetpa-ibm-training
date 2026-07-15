import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ABeautifulMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int oneRow = 0;
        int oneCol = 0;

        // Scan the 5x5 matrix
        for (int r = 1; r <= 5; r++) {
            st = new StringTokenizer(br.readLine());
            for (int c = 1; c <= 5; c++) {
                int val = Integer.parseInt(st.nextToken());
                if (val == 1) {
                    oneRow = r;
                    oneCol = c;
                }
            }
        }

        // Compute Manhattan distance to the center (3, 3)
        int moves = Math.abs(oneRow - 3) + Math.abs(oneCol - 3);

        System.out.println(moves);
    }
}