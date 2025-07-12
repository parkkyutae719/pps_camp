import java.util.Scanner;

public class 박규태_A039_20250713 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input num: ");
        int num = sc.nextInt();

        if (num == 1) {
            System.out.println("Output: true");
            return;
        }

        long left = 1;
        long right = num / 2;

        boolean isPerfectSquare = false;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == num) {
                isPerfectSquare = true;
                break;
            } else if (square < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println("Output: " + isPerfectSquare);
    }
}
