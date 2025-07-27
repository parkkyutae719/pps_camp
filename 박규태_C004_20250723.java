import java.util.Scanner;

public class 박규태_C004_20250723 {
    public static int getSum(int n) {
        int sum = n;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;

        for (int i = N - (9 * String.valueOf(N).length()); i < N; i++) {
            if (i > 0 && getSum(i) == N) {
                result = i;
                break;
            }
        }

        System.out.println(result);
        sc.close();
    }
}

