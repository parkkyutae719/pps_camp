import java.util.Scanner;

public class 박규태_A005_20250710 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input skill: ");
        String skill = sc.nextLine();

        System.out.print("Input skill_trees ([띄어쓰기 없이 쉼표로]): ");
        String input = sc.nextLine();
        input = input.replaceAll("[\\[\\]\\s]", "");
        String[] skill_trees = input.split(",");

        int count = 0;

        for (String tree : skill_trees) {
            String filtered = "";
            for (char c : tree.toCharArray()) {
                if (skill.indexOf(c) != -1) {
                    filtered += c;
                }
            }
            if (skill.startsWith(filtered)) {
                count++;
            }
        }

        System.out.println("Output: " + count);
    }
}
