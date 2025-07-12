import java.util.*;

public class 박규태_A013_22400253 {
    public List<Integer> singleNumbers(int[] nums) {
        Map<Integer, Integer> countMap = new LinkedHashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                result.add(entry.getKey());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        박규태_A013_22400253 obj = new 박규태_A013_22400253();

        System.out.print("Enter num > ");
        String[] inputs = sc.nextLine().split(" ");
        int[] nums = new int[inputs.length];
        
        for (int i = 0; i < inputs.length; i++) {
            nums[i] = Integer.parseInt(inputs[i]);
        }

        List<Integer> singles = obj.singleNumbers(nums);

        if (singles.isEmpty()) {
            System.out.println("Once Numbers Not Exist");
        } else {
            System.out.print("Once Data > ");
            for (int num : singles) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
