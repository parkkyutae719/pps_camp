import java.util.*;

public class 박규태_B050_20250716 {
    static class Node {
        int to, weight;
        Node(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    static ArrayList<Node>[] tree;
    static boolean[] visited;
    static int maxDistance = 0;
    static int farthestNode = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        tree = new ArrayList[V + 1];
        for (int i = 1; i <= V; i++) {
            tree[i] = new ArrayList<>();
        }
        for (int i = 0; i < V; i++) {
            int from = sc.nextInt();
            while (true) {
                int to = sc.nextInt();
                if (to == -1) break;
                int weight = sc.nextInt();
                tree[from].add(new Node(to, weight));
            }
        }

        visited = new boolean[V + 1];
        dfs(1, 0);
        visited = new boolean[V + 1];
        maxDistance = 0;
        dfs(farthestNode, 0);
        System.out.println(maxDistance);
    }

    public static void dfs(int node, int sum) {
        visited[node] = true;

        if (sum > maxDistance) {
            maxDistance = sum;
            farthestNode = node;
        }

        for (Node next : tree[node]) {
            if (!visited[next.to]) {
                dfs(next.to, sum + next.weight);
            }
        }
    }
}
