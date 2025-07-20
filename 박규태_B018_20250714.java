import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class 박규태_B018_20250714 {
    static class Node {
        int val;
        Node left;
        Node right;
        Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("노드입력(쉼표로 구분, 없는건 null 입력, 띄어쓰기없이) : ");
        String[] input = s.nextLine().split(",");
        int n = input.length;
        Integer[] nodes = new Integer[n];

        for (int i = 0; i < n; i++) {
            nodes[i] = input[i].trim().equals("null") ? null : Integer.parseInt(input[i].trim());
        }

        System.out.print("Enter target sum: ");
        int targetSum = s.nextInt();

        Node root = buildTree(nodes);

        boolean hasPath = hasPathSum(root, targetSum);
        System.out.println(hasPath);
    }

    static Node buildTree(Integer[] arr) {
        if (arr.length == 0 || arr[0] == null) return null;

        Node root = new Node(arr[0]);
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int index = 1;

        while (!queue.isEmpty() && index < arr.length) {
            Node current = queue.poll();
            if (index < arr.length && arr[index] != null) {
                current.left = new Node(arr[index]);
                queue.add(current.left);
            }
            index++;
            if (index < arr.length && arr[index] != null) {
                current.right = new Node(arr[index]);
                queue.add(current.right);
            }
            index++;
        }

        return root;
    }

    static boolean hasPathSum(Node node, int sum) {
        if (node == null) return false;

        if (node.left == null && node.right == null) {
            return sum == node.val;
        }

        return hasPathSum(node.left, sum - node.val) || hasPathSum(node.right, sum - node.val);
    }
}
