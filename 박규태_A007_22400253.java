
import java.util.Scanner;

public class 박규태_A007_22400253 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] notes = new int[8];
        System.out.print("Enter 8 numbers > ");
        for (int i = 0; i < 8; i++) {
            notes[i] = sc.nextInt();
        }

        boolean isAscending = true;
        boolean isDescending = true;

        for (int i = 0; i < 7; i++) {
            if (notes[i] < notes[i + 1]) {
                isDescending = false;
            } else if (notes[i] > notes[i + 1]) {
                isAscending = false;
            }
        }

        if (isAscending) {
            System.out.println("ascending");
        } else if (isDescending) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
