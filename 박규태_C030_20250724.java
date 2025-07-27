import java.util.Scanner;

public class 박규태_C030_20250724 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        System.out.println(combination(M - 1, N - 1));
    }

    public static int combination(int n, int r) {
        if (r == 0 || n == r) return 1;

        int[][] dp = new int[n + 1][r + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= Math.min(i, r); j++) {
                if (j == 0 || j == i) dp[i][j] = 1;
                else dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
        }
        return dp[n][r];
    }
}
