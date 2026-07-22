import java.util.*;

public class AWordCapitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        char first = Character.toUpperCase(s.charAt(0));
        System.out.println(first + s.substring(1));
    }
}