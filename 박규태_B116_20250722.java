import java.util.Scanner;

public class 박규태_B116_20250722 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int pos = 0;

            while (n > 0) {
                if ((n & 1) == 1) {
                    System.out.print(pos + " ");
                }
                n >>= 1;
                pos++;
            }
            System.out.println();
        }
    }
}

