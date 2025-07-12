import java.util.Scanner;

public class 박규태_A030_20250713 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int currentMood = sc.nextInt(); // 0:좋은날, 1:싫은날

        double[][] prob = new double[2][2];
        for (int i = 0; i < 2; i++) {
            prob[i][0] = sc.nextDouble(); // i일때 다음 좋은날 확률
            prob[i][1] = sc.nextDouble(); // i일때 다음 싫은날 확률
        }

        double goodProb = currentMood == 0 ? 1.0 : 0.0;
        double badProb = currentMood == 1 ? 1.0 : 0.0;

        for (int day = 0; day < N; day++) {
            double nextGood = goodProb * prob[0][0] + badProb * prob[1][0];
            double nextBad = goodProb * prob[0][1] + badProb * prob[1][1];

            goodProb = nextGood;
            badProb = nextBad;
        }

        int goodResult = (int)Math.round(goodProb * 1000);
        int badResult = (int)Math.round(badProb * 1000);

        System.out.println(goodResult);
        System.out.println(badResult);
    }
}
