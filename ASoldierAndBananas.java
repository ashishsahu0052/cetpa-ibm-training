import java.util.Scanner;

public class ASoldierAndBananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long k = sc.nextLong();
        long n = sc.nextLong();
        long w = sc.nextLong();

        // Calculate the total cost using the formula
        long totalCost = k * (w * (w + 1)) / 2;

        // Calculate how much he needs to borrow
        long borrow = totalCost - n;

        // If borrow is negative or zero, it means he doesn't need any money
        if (borrow < 0) {
            System.out.println(0);
        } else {
            System.out.println(borrow);
        }

        sc.close();
    }
}