import java.util.*;

public class 박규태_A011_20250710 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input N (number of stages): ");
        int N = sc.nextInt();
        sc.nextLine();

        System.out.print("Input stages ([띄어쓰기 없이 쉼표로]): ");
        String line = sc.nextLine();
        line = line.replaceAll("[\\[\\]\\s]", "");
        String[] tokens = line.split(",");
        int[] stages = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            stages[i] = Integer.parseInt(tokens[i]);
        }

        int[] count = new int[N + 2];
        for (int s : stages) {
            count[s]++;
        }

        int players = stages.length;
        List<int[]> failureList = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            int stay = count[i];
            double failure = (players == 0) ? 0 : (double) stay / players;
            failureList.add(new int[]{i, (int)(failure * 1_000_000_000)});
            players -= stay;
        }

        failureList.sort((a, b) -> {
            if (b[1] != a[1]) return b[1] - a[1];
            return a[0] - b[0];
        });

        int[] result = new int[N];
        for (int i = 0; i < N; i++) {
            result[i] = failureList.get(i)[0];
        }

        System.out.print("Output: ");
        System.out.println(Arrays.toString(result));
    }
}


