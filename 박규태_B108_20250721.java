import java.util.HashSet;
import java.util.Scanner;

public class 박규태_B108_20250721 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("N 입력하시오 (추후 입력받을 단어와 비교될 기존 단어의 개수) : ");
        int N = sc.nextInt();
        System.out.print("M 입력하시오 (기존 N개와 비교할 단어의 개수) : ");
        int M = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기

        HashSet<String> set = new HashSet<>();
        System.out.println("단어 " + N + "개 입력 : ");
        for (int i = 0; i < N; i++) {
            set.add(sc.nextLine());
        }

        int count = 0;
        System.out.println("비교할 단어 " + M + "개 입력 :");
        for (int i = 0; i < M; i++) {
            String str = sc.nextLine();
            if (set.contains(str)) {
                count++;
            }
        }

        System.out.println("최종 결과 : " + count);
        sc.close();
    }
}
