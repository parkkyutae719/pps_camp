import java.util.Arrays;
import java.util.Scanner;

public class 박규태_A001_20250710 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input g = ");
        String gInput = sc.nextLine();
        String[] gTokens = gInput.trim().split("\\s+");
        int[] g = new int[gTokens.length];
        for (int i = 0; i < gTokens.length; i++) {
            g[i] = Integer.parseInt(gTokens[i]);
        }

        System.out.print("Input s = ");
        String sInput = sc.nextLine();
        String[] sTokens = sInput.trim().split("\\s+");
        int[] s = new int[sTokens.length];
        for (int i = 0; i < sTokens.length; i++) {
            s[i] = Integer.parseInt(sTokens[i]);
        }

        Arrays.sort(g);
        Arrays.sort(s);

        int child = 0;
        int cookie = 0;

        while (child < g.length && cookie < s.length) {
            if (s[cookie] >= g[child]) {
                child++;
            }
            cookie++;
        }

        System.out.println("Output: " + child);
    }
}



