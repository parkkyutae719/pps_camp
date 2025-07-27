import java.util.Scanner;

public class 박규태_B118_20250722 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        for (int i = 0; i < N; i++) {
            int r = sc.nextInt();
            int e = sc.nextInt();
            int c = sc.nextInt();
            
            int profitDiff = e - c;

            if (profitDiff > r) {
                System.out.println("advertise");
            } else if (profitDiff == r) {
                System.out.println("does not matter");
            } else {
                System.out.println("do not advertise");
            }
        }

        sc.close();
    }
}
