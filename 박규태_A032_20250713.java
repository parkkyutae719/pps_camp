import java.util.Scanner;

public class 박규태_A032_20250713 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트케이스 수
        for (int t = 0; t < T; t++) {
            int k = sc.nextInt(); // 층
            int n = sc.nextInt(); // 호

            int[][] apt = new int[k+1][n+1];

            // 0층 초기화
            for (int i = 1; i <= n; i++) {
                apt[0][i] = i;
            }

            // 1층 ~ k층 계산
            for (int i = 1; i <= k; i++) {
                for (int j = 1; j <= n; j++) {
                    apt[i][j] = apt[i][j-1] + apt[i-1][j];
                }
            }

            System.out.printf( "> %d", apt[k][n]);
        }
    }
}