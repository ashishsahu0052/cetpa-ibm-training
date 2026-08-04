import java.util.*;

public class AAntonAndLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        boolean[] seen = new boolean[26];
        int count = 0;

        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if (!seen[ch - 'a']) {
                    seen[ch - 'a'] = true;
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}