import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class 박규태_A034_22400253 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> remainders = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter num > ");
            int num = sc.nextInt();
            remainders.add(num % 42);
        }

        System.out.println(remainders.size());
    }
}
