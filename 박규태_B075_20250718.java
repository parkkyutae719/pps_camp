import java.util.Scanner;

public class 박규태_B075_20250718 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] coin = {1, 2, 5, 7};
        int[] dp = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = 0; j < 4; j++) {
                if (i - coin[j] >= 0 && dp[i - coin[j]] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - coin[j]] + 1);
                }
            }
        }

        if (dp[N] == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(dp[N]);
        }
    }
}
