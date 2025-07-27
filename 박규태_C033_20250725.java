import java.util.Scanner;

public class 박규태_C033_20250725 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double X = sc.nextDouble();
        double Y = sc.nextDouble();
        double minPerGram = X / Y;

        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            double Xi = sc.nextDouble();
            double Yi = sc.nextDouble();

            double perGram = Xi / Yi;
            if (perGram < minPerGram) {
                minPerGram = perGram;
            }
        }
        double result = minPerGram * 1000;
        System.out.printf("%.2f\n", result);
    }
}
