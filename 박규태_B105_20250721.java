import java.util.*;

public class 박규태_B105_20250721 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("답 개수 > ");
        int n = sc.nextInt();
        int[] answers = new int[n];

        System.out.print("띄어쓰기로 답 입력 > ");
        for (int i = 0; i < n; i++) {
            answers[i] = sc.nextInt();
        }

        박규태_B105_20250721 test = new 박규태_B105_20250721();
        int[] result = test.solution(answers);

        System.out.print("Top scorer(s): ");
        for (int r : result) {
            System.out.print(r + " ");
        }
    }

    public int[] solution(int[] answers) {
        int[] ptn1 = {1, 2, 3, 4, 5};
        int[] ptn2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] ptn3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] cnt = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == ptn1[i % ptn1.length]) cnt[0]++;
            if (answers[i] == ptn2[i % ptn2.length]) cnt[1]++;
            if (answers[i] == ptn3[i % ptn3.length]) cnt[2]++;
        }

        int max = Math.max(cnt[0], Math.max(cnt[1], cnt[2]));

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (cnt[i] == max) result.add(i + 1);
        }

        int[] resultArr = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArr[i] = result.get(i);
        }

        return resultArr;
    }
}
