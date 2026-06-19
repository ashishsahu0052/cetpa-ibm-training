import java.util.*;

public class AWatermelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("enter the wieght of eatermelon");
        int weight = sc.nextInt();
        if (isEven(weight)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

    public static boolean isEven(int weight) {
        if (weight <= 2)
            return false;
        if (weight % 2 == 0) {
            return true;
        } else
            return false;

    }
}
