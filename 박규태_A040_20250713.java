import java.util.Scanner;

public class 박규태_A040_20250713 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input s: ");
        String s = sc.nextLine();

        int n = s.length();
        int mid = n / 2;

        String a = s.substring(0, mid);
        String b = s.substring(mid);

        int countA = countVowels(a);
        int countB = countVowels(b);

        System.out.println("Output: " + (countA == countB));
    }

    private static int countVowels(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
}
