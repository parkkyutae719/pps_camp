import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class 박규태_B002_20250714 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[][] employees = new int[n][3];
        Map<Integer, ArrayList<Integer>> subMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int id = s.nextInt();
            int importance = s.nextInt();
            int subCount = s.nextInt();

            employees[i][0] = id;
            employees[i][1] = importance;
            employees[i][2] = subCount;

            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < subCount; j++) {
                list.add(s.nextInt());
            }
            subMap.put(id, list);
        }

        int targetId = s.nextInt();
        boolean[] visited = new boolean[2001];
        int totalImportance = getImportance(employees, subMap, targetId, visited);
        System.out.println(totalImportance);
    }

    static int getImportance(int[][] employees, Map<Integer, ArrayList<Integer>> subMap, int id, boolean[] visited) {
        if (visited[id]) return 0;
        visited[id] = true;

        int importance = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i][0] == id) {
                importance += employees[i][1];
                ArrayList<Integer> subs = subMap.get(id);
                if (subs != null) {
                    for (int subId : subs) {
                        importance += getImportance(employees, subMap, subId, visited);
                    }
                }
                break;
            }
        }
        return importance;
    }
}
