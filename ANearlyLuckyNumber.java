import java.util.*;

public class ANearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        int count = 0;

        for (char c : n.toCharArray()) {
            if (c == '4' || c == '7') {
                count++;
            }
        }

        if (isLucky(count)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    static boolean isLucky(int x) {
        if (x == 0)
            return false;

        while (x > 0) {
            int d = x % 10;
            if (d != 4 && d != 7) {
                return false;
            }
            x /= 10;
        }

        return true;
    }
}