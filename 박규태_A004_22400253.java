import java.util.*;

public class 박규태_A004_22400253 {

    public static int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();

        for (int num : arr) {
            if (num % divisor == 0) {
                list.add(num);
            }
        }

        if (list.isEmpty()) {
            return new int[]{-1};
        }
        Collections.sort(list);
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("input the size of list: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("input the list:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("input the divisor: ");
        int divisor = sc.nextInt();
        int[] result = solution(arr, divisor);
        System.out.println("Result: " + Arrays.toString(result));

        sc.close();
    }
}

