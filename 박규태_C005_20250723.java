import java.util.*;

public class 박규태_C005_20250723 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 참가자 입력
        System.out.println("Enter number of participants:");
        int n = sc.nextInt();
        sc.nextLine();
        String[] participant = new String[n];
        System.out.println("Enter participants:");
        for (int i = 0; i < n; i++) {
            participant[i] = sc.nextLine();
        }

        String[] completion = new String[n - 1];
        System.out.println("Enter completions:");
        for (int i = 0; i < n - 1; i++) {
            completion[i] = sc.nextLine();
        }

        String answer = solution(participant, completion);
        System.out.println("Result: " + answer);
        
        sc.close();
    }

    public static String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String name : participant) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }
        for (String name : completion) {
            map.put(name, map.get(name) - 1);
        }
        for (String key : map.keySet()) {
            if (map.get(key) == 1) {
                return key;
            }
        }

        return "";
    }
}
