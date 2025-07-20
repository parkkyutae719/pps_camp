import java.util.Scanner;

public class 박규태_B074_20250720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        System.out.println(solution(num));
    }

    public static int solution(long num) {
        int count = 0;

        while (num != 1) {
            if (count >= 500) {
                return -1;
            }

            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = num * 3 + 1;
            }

            count++;
        }

        return count;
    }
}
