import java.util.*;

public class 박규태_B117_20250722 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        Map<String, Integer> inOrder = new HashMap<>();
        for (int i = 0; i < N; i++) {
            inOrder.put(sc.nextLine(), i);
        }

        int[] outOrder = new int[N];
        for (int i = 0; i < N; i++) {
            String car = sc.nextLine();
            outOrder[i] = inOrder.get(car);
        }

        int count = 0;
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (outOrder[i] > outOrder[j]) {
                    count++;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}
