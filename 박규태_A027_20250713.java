import java.util.Scanner;

public class 박규태_A027_20250713 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number: ");
        String number = sc.nextLine();

        System.out.print("Input k: ");
        int k = sc.nextInt();

        String result = "";
        int index = 0;
        int length = number.length() - k;

        for (int i = 0; i < length; i++) {
            char max = '0';
            for (int j = index; j <= k + i; j++) {
                if (number.charAt(j) > max) {
                    max = number.charAt(j);
                    index = j + 1;
                }
            }
            result += max;
        }

        System.out.println("Output: " + result);
    }
}
