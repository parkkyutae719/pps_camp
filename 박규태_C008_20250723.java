import java.util.*;

public class 박규태_C008_20250723 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of words:");
        int n = Integer.parseInt(sc.nextLine());

        String[] words = new String[n];
        System.out.println("Enter words:");
        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }

        String[] result = findWords(words);
        System.out.println("Output:");
        for (String word : result) {
            System.out.println(word);
        }

        sc.close();
    }

    public static String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        List<String> result = new ArrayList<>();

        for (String word : words) {
            String lower = word.toLowerCase();
            if (inSameRow(lower, row1) || inSameRow(lower, row2) || inSameRow(lower, row3)) {
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
    }

    private static boolean inSameRow(String word, String row) {
        for (char c : word.toCharArray()) {
            if (row.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}
