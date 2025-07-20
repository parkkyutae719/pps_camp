
import java.util.Scanner;

public class 박규태_A020_22400253 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int current = 0; 
        int max = 0;

        for (int i = 0; i < 4; i++) {
          System.out.print("Enter Out and in people num > ");
            int out = sc.nextInt();
            int in = sc.nextInt();

            current -= out;
            current += in;

            if (current > max) {
                max = current;
            }
        }

        System.out.println(max);
    }
}
