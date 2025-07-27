import java.util.Scanner;

public class 박규태_C032_20250725 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();

        int layer = 1;
        long maxNum = 1;

        while (maxNum < N) {
            maxNum += 6L * layer;
            layer++;
        }

        System.out.println(layer);
    }
}
