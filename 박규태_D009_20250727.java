import java.util.Scanner;

public class 박규태_D009_20250727 {
    static int[][] map, dp;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        map = new int[n][n];
        dp = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                map[i][j] = sc.nextInt();

        int max = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                max = Math.max(max, dfs(i, j));

        System.out.println(max);
        sc.close();
    }

    static int dfs(int y, int x) {
        if (dp[y][x] != 0) return dp[y][x];

        dp[y][x] = 1;
        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];

            if (nx >= 0 && ny >= 0 && nx < n && ny < n && map[ny][nx] > map[y][x]) {
                dp[y][x] = Math.max(dp[y][x], dfs(ny, nx) + 1);
            }
        }

        return dp[y][x];
    }
}
