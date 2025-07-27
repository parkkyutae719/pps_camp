import java.util.*;

public class 박규태_C027_20250724 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int e = sc.nextInt();
        int s = sc.nextInt();
        int m = sc.nextInt();

        int E = 1, S = 1, M = 1;
        int year = 1;

        while (true) {
            if (E == e && S == s && M == m) {
                System.out.println(year);
                break;
            }

            E++; S++; M++;
            year++;

            if (E > 15) E = 1;
            if (S > 28) S = 1;
            if (M > 19) M = 1;
        }

        sc.close();
    }
}
