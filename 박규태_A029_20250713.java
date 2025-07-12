import java.util.Scanner;

public class  박규태_A029_20250713{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 총 문 개수
        int first = sc.nextInt(); // 첫번째 문 여는 방법

        int[] doors = new int[N];
        doors[0] = first;

        // 규칙에 따라 두 번째 문부터 순서대로 정하기
        for (int i = 1; i < N; i++) {
            doors[i] = doors[i - 1] == 0 ? 1 : 0; // 연속 X : 이전과 다르게
        }

        // 2의 배수 문들 검사
        for (int i = 1; i < N; i++) {
            if ((i + 1) % 2 == 0) { // i는 0-indexed
                if (doors[i] != doors[1]) {
                    System.out.println("Love is open door");
                    return;
                }
            }
            if ((i + 1) % 3 == 0) {
                if (doors[i] != doors[2]) {
                    System.out.println("Love is open door");
                    return;
                }
            }
        }

        // 문제 없으면 두번째 문부터 출력
        for (int i = 1; i < N; i++) {
            System.out.println(doors[i]);
        }
    }
}
