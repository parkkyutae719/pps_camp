import java.util.Scanner;
import java.util.ArrayList;

public class 박규태_B001_20250714 {
    static boolean[] visited;
    static ArrayList<Integer>[] graph;
    static int count = 0;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int m = s.nextInt();

        graph = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            graph[a].add(b);
            graph[b].add(a);
        }

        dfs(1);
        System.out.println(count - 1);
    }

    public static void dfs(int node) {
        visited[node] = true;
        count++;
        for (int next : graph[node]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }
}
