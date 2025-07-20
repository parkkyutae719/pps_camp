
import java.util.Scanner;

public class 박규태_A015_22400253 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter num > ");
        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            sum += num * num;
        }

        // 검증수 계산 및 출력
        int checkDigit = sum % 10;
        System.out.println(checkDigit);
    }
}
