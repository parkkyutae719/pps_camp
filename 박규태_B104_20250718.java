import java.util.HashSet;
import java.util.Scanner;

public class 박규태_B104_20250718 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        HashSet<Integer> cards = new HashSet<>();
        for (int i = 0; i < n; i++) {
            cards.add(sc.nextInt());
        }

        int m = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            int query = sc.nextInt();
            if (cards.contains(query)) {
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }
        }
        System.out.println(sb.toString().trim());
    }
}
