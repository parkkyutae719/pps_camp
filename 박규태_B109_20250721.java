import java.util.*;

public class 박규태_B109_20250721 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        for (int i = 0; i < n; i++) {
            setA.add(sc.nextInt());
        }
        for (int i = 0; i < m; i++) {
            setB.add(sc.nextInt());
        }
        Set<Integer> diff1 = new HashSet<>(setA);
        diff1.removeAll(setB);

        Set<Integer> diff2 = new HashSet<>(setB);
        diff2.removeAll(setA);

        System.out.println(diff1.size() + diff2.size());

        sc.close();
    }
}
