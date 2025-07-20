import java.util.*;

public class 박규태_B031_20250715 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int N = sc.nextInt();
        int[] favorites = new int[N];

        for (int i = 0; i < N; i++) {
            favorites[i] = sc.nextInt();
        }

        boolean[] visited = new boolean[1000];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{A, 0});
        visited[A] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int freq = current[0];
            int count = current[1];

            if (freq == B) {
                System.out.println(count);
                return;
            }

            if (freq + 1 < 1000 && !visited[freq + 1]) {
                visited[freq + 1] = true;
                queue.offer(new int[]{freq + 1, count + 1});
            }

            if (freq - 1 >= 0 && !visited[freq - 1]) {
                visited[freq - 1] = true;
                queue.offer(new int[]{freq - 1, count + 1});
            }

            for (int i = 0; i < N; i++) {
                int next = favorites[i];
                if (!visited[next]) {
                    visited[next] = true;
                    queue.offer(new int[]{next, count + 1});
                }
            }
        }
    }
}
