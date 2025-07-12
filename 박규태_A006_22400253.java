import java.util.Scanner;

public class 박규태_A006_22400253 {
    boolean solution(String s) {
        s = s.toLowerCase();

        int pCount = 0;
        int yCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'p') {
                pCount++;
            } else if (c == 'y') {
                yCount++;
            }
        }

        return pCount == yCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        박규태_A006_22400253 obj = new 박규태_A006_22400253();

        System.out.print("문자열을 입력하세요: ");
        String s = sc.nextLine();
        boolean result = obj.solution(s);
        System.out.println(result);
    }
}
