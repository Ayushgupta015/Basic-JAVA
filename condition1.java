import java.util.*;
public class condition1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();

            if(x%2 == 0){
                System.out.println("the no is even");
            }
            else{
                System.out.println("the no is odd");
            }
        }

    }
    
}
