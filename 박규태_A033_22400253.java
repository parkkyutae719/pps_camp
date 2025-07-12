import java.util.Scanner;

public class 박규태_A033_22400253 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int winnerNum = 0;
        int maxScore = 0;

        for (int i = 1; i <= 5; i++) {
            int sum = 0;
            System.out.print("Enter score > ");
            for (int j = 0; j < 4; j++) {
                sum += sc.nextInt();
            }
            if (sum > maxScore) {
                maxScore = sum;
                winnerNum = i;
            }
        }

        System.out.println(winnerNum + " " + maxScore);
    }
}
