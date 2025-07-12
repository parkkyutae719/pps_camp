import java.util.Scanner;

public class 박규태_A025_20250713 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = sc.nextInt();

        boolean isPowerOfFour = false;

        if (n > 0) {
            while (n % 4 == 0) {
                n /= 4;
            }
            if (n == 1) {
                isPowerOfFour = true;
            }
        }

        System.out.println("Output: " + isPowerOfFour);
    }
}
