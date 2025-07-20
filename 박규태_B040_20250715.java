import java.util.Scanner;

public class 박규태_B040_20250715 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String dna = sc.next();

        int mutationCount = 0;
        char prev = 'A';

        for (int i = 0; i < n; i++) {
            char curr = dna.charAt(i);
            if (curr != prev && curr == 'B') {
                mutationCount++;
                prev = 'B';
            } else {
                prev = curr;
            }
        }

        System.out.println(mutationCount);
    }
}
