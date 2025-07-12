import java.util.Scanner;

public class 박규태_A026_22400253 {
    public boolean solution(int x) {
        int sum = 0;
        int temp = x;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        return x % sum == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        박규태_A026_22400253 obj = new 박규태_A026_22400253();

        System.out.print("enter the num: ");
        int x = sc.nextInt();

        boolean result = obj.solution(x);
        System.out.println(result);
    }
}
