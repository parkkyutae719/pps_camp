import java.util.Scanner;

public class 박규태_A012_20250710 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input n: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Output: 0");
            return;
        }

        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i < n; i++) {
            if (!isPrime[i]) continue;
            for (int j = i * i; j < n; j += i) {
                isPrime[j] = false;
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) count++;
        }

        System.out.println("Output: " + count);
    }
}

