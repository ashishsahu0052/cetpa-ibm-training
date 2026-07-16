import java.util.*;

public class ABoyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        boolean[] seen = new boolean[26];
        int count = 0;

        for (char ch : s.toCharArray()) {
            if (!seen[ch - 'a']) {
                seen[ch - 'a'] = true;
                count++;
            }
        }

        if (count % 2 == 0)
            System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");
    }
}