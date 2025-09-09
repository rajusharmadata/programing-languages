// * * * *
// * * *
// * *
// *
import java.util.*;
public class Que2 {
    public static void main(String[]args){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter number");
            int n = sc.nextInt();
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i+1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        
        }
    
}
