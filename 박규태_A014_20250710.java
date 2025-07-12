import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class 박규태_A014_20250710 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input nums ([띄어쓰기 없이 쉼표로]): ");
        String input = sc.nextLine();
        input = input.replaceAll("[\\[\\]\\s]", "");
        String[] tokens = input.split(",");
        int[] nums = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            nums[i] = Integer.parseInt(tokens[i]);
        }

        List<String> result = new ArrayList<>();
        if (nums.length != 0) {
            int start = nums[0];
            int end = nums[0];

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == end + 1) {
                    end = nums[i];
                } else {
                    if (start == end) {
                        result.add(start + "");
                    } else {
                        result.add(start + "->" + end);
                    }
                    start = end = nums[i];
                }
            }

            if (start == end) {
                result.add(start + "");
            } else {
                result.add(start + "->" + end);
            }
        }

        System.out.println("Output: " + result);
    }
}
