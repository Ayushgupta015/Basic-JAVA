import java.util.*;
public class function2 {
    public static int calculatemultiply(int a, int b){
        int multiply = a*b;
        return multiply;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int multiply = calculatemultiply(a, b);
            System.out.println("multiply 2 no is:"+multiply);
        }
    }
    
}
// make a function to multiply 2 no and return the product