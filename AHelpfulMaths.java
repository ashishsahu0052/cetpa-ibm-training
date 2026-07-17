import java.util.*;

public class AHelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String[] arr = s.split("\\+");
        Arrays.sort(arr);

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (i > 0)
                ans.append("+");
            ans.append(arr[i]);
        }

        System.out.println(ans);
    }
}