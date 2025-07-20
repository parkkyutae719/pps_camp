import java.util.Scanner;

public class 박규태_B071_20250716 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] price = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            price[i] = sc.nextInt();
        }

        int[] dp = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = i; j <= N; j++) {
                dp[j] = Math.max(dp[j], dp[j - i] + price[i]);
            }
        }

        System.out.println(dp[N]);
    }
}
