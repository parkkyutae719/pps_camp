import java.util.Scanner;

public class 박규태_A010_20250710 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input string s: ");
        String s = sc.nextLine();

        int min = s.length();

        for (int step = 1; step <= s.length() / 2; step++) {
            String compressed = "";
            String prev = s.substring(0, step);
            int count = 1;

            for (int j = step; j < s.length(); j += step) {
                int end = Math.min(j + step, s.length());
                String current = s.substring(j, end);

                if (prev.equals(current)) {
                    count++;
                } else {
                    compressed += (count > 1 ? count : "") + prev;
                    prev = current;
                    count = 1;
                }
            }

            compressed += (count > 1 ? count : "") + prev;
            min = Math.min(min, compressed.length());
        }

        System.out.println("Output: " + min);
    }
}
