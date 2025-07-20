import java.util.*;

public class 박규태_B032_20250715 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] grow = new int[n];

        for (int i = 0; i < n; i++) {
            grow[i] = sc.nextInt();
        }

        Arrays.sort(grow);

        int maxDay = 0;
        for (int i = 0; i < n; i++) {
            int finishDay = grow[n - 1 - i] + i + 1;
            if (finishDay > maxDay) {
                maxDay = finishDay;
            }
        }
        System.out.println(maxDay + 1);
    }
}
