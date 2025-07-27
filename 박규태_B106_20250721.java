import java.util.*;

public class 박규태_B106_20250721 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("최소공배수를 계산할 숫자의 개수는? > ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("띄어쓰기로 숫자 요소들 입력 > ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        박규태_B106_20250721 test = new 박규태_B106_20250721();
        int result = test.solution(arr);

        System.out.println("최소공배수 : " + result);
    }

    public int solution(int[] arr) {
        int lcm = arr[0];
        for (int i = 1; i < arr.length; i++) {
            lcm = lcm(lcm, arr[i]);
        }
        return lcm;
    }

    private int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
