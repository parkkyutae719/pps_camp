import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class 박규태_A037_20250713 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input left: ");
        int left = sc.nextInt();
        System.out.print("Input right: ");
        int right = sc.nextInt();

        List<Integer> result = new ArrayList<>();

        for (int num = left; num <= right; num++) {
            int temp = num;
            boolean isSelfDividing = true;

            while (temp > 0) {
                int digit = temp % 10;
                if (digit == 0 || num % digit != 0) {
                    isSelfDividing = false;
                    break;
                }
                temp /= 10;
            }

            if (isSelfDividing) {
                result.add(num);
            }
        }

        System.out.println("Output: " + result);
    }
}
