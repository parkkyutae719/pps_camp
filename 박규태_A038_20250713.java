import java.util.Scanner;

public class 박규태_A038_20250713 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input x: ");
        int x = sc.nextInt();

        if (x == 0 || x == 1) {
            System.out.println("Output: " + x);
            return;
        }

        int left = 1;
        int right = x;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid <= x / mid) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println("Output: " + ans);
    }
}
