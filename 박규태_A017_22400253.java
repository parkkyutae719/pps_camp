
import java.util.Scanner;

public class 박규태_A017_22400253 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter room num > ");
        String roomNumber = sc.nextLine();

        int[] count = new int[10];
        for (int i = 0; i < roomNumber.length(); i++) {
            int digit = roomNumber.charAt(i) - '0';
            count[digit]++;
        }
        int sixNineCount = count[6] + count[9];
        count[6] = count[9] = (sixNineCount + 1) / 2;
        int max = 0;
        for (int i = 0; i < 9; i++) {
            if (count[i] > max) {
                max = count[i];
            }
        }

        System.out.println(max);
    }
}
