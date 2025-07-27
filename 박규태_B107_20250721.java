import java.util.Scanner;

public class 박규태_B107_20250721 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 요소 개수는? > ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("띄어쓰기 해서 " + n + " 개의 숫자를 입력하라 > ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        long result = sum(a);
        System.out.println("합 : " + result);
    }

    public static long sum(int[] a) {
        long total = 0;
        for (int num : a) {
            total += num;
        }
        return total;
    }
}
