import java.util.*;
public class functon3 {
    public static void  printfactorial(int n){
       //loop
       if(n<0){
        System.out.println("Invalid number");
        return;
       }
       int factorial = 1;
       for(int i=n;i>=1;i--){
           factorial = factorial * i;
       }
       System.out.println(factorial);
       return;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            printfactorial(n);
        }
    }
    
}
// find a facorial no