import java.util.*;

public class ABuyAShovel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int r = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int lastDigit = (i * k) % 10;
            if (lastDigit == 0 || lastDigit == r) {
                System.out.println(i);
                return;
            }
        }
    }
}