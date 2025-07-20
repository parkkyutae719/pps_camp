import java.util.Scanner;

public class 박규태_B019_20250714 {
    static final int MAX = 100;
    static int N;
    static char[][] map = new char[MAX][MAX];
    static boolean[][] visited = new boolean[MAX][MAX];
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        N = s.nextInt();
        s.nextLine(); // 버퍼 비우기

        for (int i = 0; i < N; i++) {
            String line = s.nextLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = line.charAt(j);
            }
        }

        int normal = 0;
        resetVisited();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    dfs(i, j, map[i][j]);
                    normal++;
                }
            }
        }

        int weak = 0;
        resetVisited();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 'G') map[i][j] = 'R';
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    dfs(i, j, map[i][j]);
                    weak++;
                }
            }
        }

        System.out.println(normal + " " + weak);
    }

    public static void resetVisited() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                visited[i][j] = false;
            }
        }
    }

    public static void dfs(int x, int y, char color) {
        visited[x][y] = true;
        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];
            if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
                if (!visited[nx][ny] && map[nx][ny] == color) {
                    dfs(nx, ny, color);
                }
            }
        }
    }
}
