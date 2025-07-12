import java.util.Scanner;

public class 박규태_A035_22400253 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            String[] tokens = sc.nextLine().split(" ");
            double num = Double.parseDouble(tokens[0]);

            for (int j = 1; j < tokens.length; j++) {
                switch (tokens[j]) {
                    case "@":
                        num *= 3;
                        break;
                    case "%":
                        num += 5;
                        break;
                    case "#":
                        num -= 7;
                        break;
                }
            }
            System.out.printf("%result > .2f\n", num);
        }
    }
}

