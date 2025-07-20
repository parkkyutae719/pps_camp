import java.util.Scanner;
import java.util.Stack;

public class 박규태_B127_20250720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] sequence = new int[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        int current = 1;
        boolean possible = true;

        for (int i = 0; i < n; i++) {
            int target = sequence[i];

            while (current <= target) {
                stack.push(current);
                result.append("+\n");
                current++;
            }

            if (stack.peek() == target) {
                stack.pop();
                result.append("-\n");
            } else {
                possible = false;
                break;
            }
        }

        if (possible) {
            System.out.print(result);
        } else {
            System.out.println("NO");
        }
    }
}
