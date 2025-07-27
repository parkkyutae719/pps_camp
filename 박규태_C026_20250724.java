import java.util.*;

public class 박규태_C026_20250724 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();
        int m = sc.nextInt();
        boolean[] broken = new boolean[10];

        if (m > 0) {
            for (int i = 0; i < m; i++) {
                int btn = sc.nextInt();
                broken[btn] = true;
            }
        }

        int minPress = Math.abs(target - 100);

        for (int i = 0; i <= 999_999; i++) {
            String num = String.valueOf(i);
            boolean possible = true;

            for (char c : num.toCharArray()) {
                if (broken[c - '0']) {
                    possible = false;
                    break;
                }
            }

            if (possible) {
                int pressCount = num.length() + Math.abs(i - target);
                minPress = Math.min(minPress, pressCount);
            }
        }

        System.out.println(minPress);
        sc.close();
    }
}
