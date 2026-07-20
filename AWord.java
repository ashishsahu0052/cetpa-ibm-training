import java.util.Scanner;

public class AWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int uppercaseCount = 0;
        int lowercaseCount = 0;

        // Count the number of uppercase and lowercase letters
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else {
                lowercaseCount++;
            }
        }

        // Convert based on the counts
        if (uppercaseCount > lowercaseCount) {
            System.out.println(s.toUpperCase());
        } else {
            System.out.println(s.toLowerCase());
        }

        sc.close();
    }
}