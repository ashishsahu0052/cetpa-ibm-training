import java.util.*;

public class AHulk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("I ");

            if (i % 2 == 1)
                System.out.print("hate");
            else
                System.out.print("love");

            if (i == n)
                System.out.print(" it");
            else
                System.out.print(" that ");
        }
    }
}