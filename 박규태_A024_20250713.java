import java.util.Scanner;

public class 박규태_A024_20250713 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input bills ([띄어쓰기 없이 쉼표로]): ");
        String line = sc.nextLine();
        line = line.replaceAll("[\\[\\]\\s]", "");
        String[] tokens = line.split(",");
        int[] bills = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            bills[i] = Integer.parseInt(tokens[i]);
        }

        int five = 0; 
        int ten = 0; 

        boolean possible = true;

        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                if (five == 0) {
                    possible = false;
                    break;
                }
                five--;
                ten++;
            } else { // bill == 20
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    possible = false;
                    break;
                }
            }
        }

        System.out.println("Output: " + possible);
    }
}
