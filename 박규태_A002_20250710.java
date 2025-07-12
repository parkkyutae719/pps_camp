import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 박규태_A002_20250710 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: numRows = ");
        int numRows = sc.nextInt();

        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    int val = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                    row.add(val);
                }
            }
            triangle.add(row);
        }

        System.out.print("Output: ");
        System.out.println(triangle);
    }
}

