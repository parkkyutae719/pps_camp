import java.util.Scanner;
import java.math.BigInteger;

public class 박규태_B077_20250718 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        BigInteger[] dp = new BigInteger[n + 1];

        dp[0] = BigInteger.ZERO;
        dp[1] = BigInteger.ONE;
        if (n >= 2) dp[2] = BigInteger.ONE;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1].add(dp[i - 2]);
        }

        System.out.println(dp[n]);
    }
}
