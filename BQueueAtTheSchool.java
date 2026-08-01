import java.util.*;

public class BQueueAtTheSchool {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();

        char[] s = sc.next().toCharArray();

        for (int time = 0; time < t; time++) {

            for (int i = 0; i < n - 1; i++) {

                if (s[i] == 'B' && s[i + 1] == 'G') {

                    s[i] = 'G';
                    s[i + 1] = 'B';

                    // Skip next position because this boy
                    // cannot move again in the same second
                    i++;
                }
            }
        }

        System.out.println(new String(s));
    }
}