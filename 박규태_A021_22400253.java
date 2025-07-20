
import java.util.Scanner;

public class 박규태_A021_22400253 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mulit tap num > ");
        int N = sc.nextInt();
        int totalPlugs = 0;

        for (int i = 0; i < N; i++) {
            System.out.print("Enter plug num ");
            totalPlugs += sc.nextInt();
        }

        int maxComputers = totalPlugs - (N - 1);

        System.out.println(maxComputers);
    }
}
