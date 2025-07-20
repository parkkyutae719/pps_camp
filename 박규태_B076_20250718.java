import java.util.Scanner;

public class 박규태_B076_20250718 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        int[] dp = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            dp[i] = A[i];
        }

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (A[j] > A[i] && dp[i] < dp[j] + A[i]) {
                    dp[i] = dp[j] + A[i];
                }
            }
        }

        int max = 0;
        for (int i = 0; i < N; i++) {
            if (dp[i] > max) {
                max = dp[i];
            }
        }

        System.out.println(max);
    }
}
