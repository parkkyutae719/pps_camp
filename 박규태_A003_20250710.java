import java.util.Scanner;
import java.util.Arrays;

public class 박규태_A003_20250710 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input digits = ");
        String input = sc.nextLine();
        input = input.replaceAll("[\\[\\]\\s]", "");
        String[] tokens = input.split(",");
        int[] digits = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            digits[i] = Integer.parseInt(tokens[i]);
        }

        int n = digits.length;
        boolean carry = true;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                carry = false;
                break;
            }
            digits[i] = 0;
        }

        if (carry) {
            int[] result = new int[n + 1];
            result[0] = 1;
            System.out.println("Output: " + Arrays.toString(result));
        } else {
            System.out.println("Output: " + Arrays.toString(digits));
        }
    }
}

