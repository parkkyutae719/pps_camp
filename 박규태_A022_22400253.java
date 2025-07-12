import java.util.Scanner;

public class 박규태_A022_22400253 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter call time > ");
        int N = sc.nextInt();
        int[] calls = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Enter call minute > ");
            calls[i] = sc.nextInt();
        }

        int Y = 0;
        int M = 0;

        for (int time : calls) {
            Y += ((time / 30) + 1) * 10;
            M += ((time / 60) + 1) * 15;
        }

        if (Y < M) {
            System.out.println("Y " + Y);
        } else if (M < Y) {
            System.out.println("M " + M);
        } else {
            System.out.println("Y M " + Y);
        }
    }
}
