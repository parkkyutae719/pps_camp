import java.util.*;

public class 박규태_B064_20250716 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        Arrays.sort(arr);

        int left = 0;
        int right = n - 1;
        int count = 0;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == x) {
                count++;
                left++;
                right--;
            } else if (sum < x) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println(count);
    }
}
