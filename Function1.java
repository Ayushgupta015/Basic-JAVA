import java.util.*;
public class Function1 {
    public static int calculateSum(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
             int sum = calculateSum(a, b);
             System.out.println("sum of 2 no is:"+sum);
        }
        
    }
}
// make a function to add 2 number return to sum
