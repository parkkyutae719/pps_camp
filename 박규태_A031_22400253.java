import java.util.Scanner;

public class 박규태_A031_22400253 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first num > ");
        int N = sc.nextInt();
        System.out.print("Enter second num > ");
        int M = sc.nextInt();

        // 최소 쪼개기 횟수 = N * M - 1
        System.out.println(N * M - 1);
    }
}
