
import java.util.*;

public class qus4 {
    public static void sum(int n){
        int remender ,ans= 0;
        int show = n;
        while (n>0) {
        remender = n%10;
        ans = ans+remender;
        n/=10;


        }
       System.out.println("sum of number "+show + " = "+ans);
    }
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int num = sc.nextInt();
        sum(num);
    }
    
}
