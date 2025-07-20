
import java.util.*;

public class 박규태_A018_22400253 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter list size > ");
        int N = sc.nextInt();

        Integer[] A = new Integer[N];
        int[] B = new int[N];

        System.out.print("Enter A data > ");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        System.out.print("Enter B data > ");
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }

        Arrays.sort(A);
        Integer[] indices = new Integer[N];
        for (int i = 0; i < N; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, (i1, i2) -> Integer.compare(B[i2], B[i1]));

        int S = 0;
        for (int i = 0; i < N; i++) {
            S += A[i] * B[indices[i]];
        }

        System.out.println(S);
    }
}
