import java.util.Scanner;

public class 박규태_C034_20250725 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = -1;

        for (int five = N / 5; five >= 0; five--) {
            int remain = N - (five * 5);
            if (remain % 3 == 0) {
                int three = remain / 3;
                result = five + three;
                break;
            }
        }

        System.out.println(result);
    }
}
