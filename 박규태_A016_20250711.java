import java.util.Scanner;
import java.util.Arrays;

public class 박규태_A016_20250711 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input people weights ([띄어쓰기 없이 쉼표로]): ");
        String line = sc.nextLine();
        line = line.replaceAll("[\\[\\]\\s]", "");
        String[] tokens = line.split(",");
        int[] people = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            people[i] = Integer.parseInt(tokens[i]);
        }

        System.out.print("Input limit: ");
        int limit = sc.nextInt();

        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        int boats = 0;

        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                left++;
            }
            right--;
            boats++;
        }

        System.out.println("Output: " + boats);
    }
}

