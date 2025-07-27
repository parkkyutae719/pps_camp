import java.util.*;

public class 박규태_B119_20250722 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = Integer.parseInt(sc.nextLine());
            if (n == 0) break;

            String answer = null;
            for (int i = 0; i < n; i++) {
                String word = sc.nextLine();
                if (answer == null || word.compareToIgnoreCase(answer) < 0) {
                    answer = word;
                }
            }
            System.out.println(answer);
        }

        sc.close();
    }
}
