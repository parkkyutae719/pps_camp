import java.util.Scanner;

public class 박규태_A009_22400253 {
    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }
       for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        박규태_A009_22400253 obj = new 박규태_A009_22400253();

        System.out.print("문자열을 입력하세요: ");
        String s = sc.nextLine();

        boolean result = obj.solution(s);
        System.out.println(result);
    }
}
