import java.util.Scanner;

public class 박규태_A019_22400253 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first num > ");
        int A = sc.nextInt();
        System.out.print("Enter second num > ");
        int B = sc.nextInt();
        System.out.print("Enter last num > ");
        int C = sc.nextInt();
        
        int product = A * B * C;
        
        int[] count = new int[10];
        
        String result = Integer.toString(product);
        
        for (int i = 0; i < result.length(); i++) {
            int digit = result.charAt(i) - '0';
            count[digit]++;
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println(count[i]);
        }
    }
}

//int digit = result.charAt(i) - '0'; 인덱스를 어떻게 사용하는가, 문자열 어떻게 관리하는가가 point -> 해당 문자열을 빼서 해당 인덱스값을 ++해서 늘린다는점이 좋았다.
//for문에서 i라는 인덱스 사용할 것이 아니면 String 내에서 toCharArray();
//스위치문에 따라 각 항목을 추가하는 방식도 가능하다