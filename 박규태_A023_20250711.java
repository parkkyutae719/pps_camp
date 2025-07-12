import java.util.Scanner;

public class 박규태_A023_20250711 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input num: ");
        int num = sc.nextInt();

        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }

        System.out.println("Output: " + num);
    }
}

