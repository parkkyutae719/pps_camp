import java.util.Scanner;

public class 박규태_C029_20250724 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();

        if (C <= B) {
            System.out.println(-1);
        } else {
            System.out.println((A / (C - B)) + 1);
        }
    }
}
