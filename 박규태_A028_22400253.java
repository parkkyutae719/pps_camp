import java.util.Scanner;
import java.math.BigInteger;

public class 박규태_A028_22400253 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first num > ");
        String A = sc.next();
        System.out.print("Enter second num > ");
        String B = sc.next();
        BigInteger bigA = new BigInteger(A);
        BigInteger bigB = new BigInteger(B);

        // 덧셈 수행
        BigInteger sum = bigA.add(bigB);

        // 결과 출력
        System.out.println(sum);
    }
}
