import java.util.Scanner;
import java.util.ArrayList;

public class 박규태_B049_20250715 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer>[] tree = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            tree[a].add(b);
            tree[b].add(a);
        }
        int[] parent = new int[n + 1];
        boolean[] visited = new boolean[n + 1];
        dfs(1, tree, parent, visited);
        for (int i = 2; i <= n; i++) {
            System.out.println(parent[i]);
        }
    }

    public static void dfs(int current, ArrayList<Integer>[] tree, int[] parent, boolean[] visited) {
        visited[current] = true;
        for (int next : tree[current]) {
            if (!visited[next]) {
                parent[next] = current;
                dfs(next, tree, parent, visited);
            }
        }
    }
}
