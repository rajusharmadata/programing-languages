import java.util.*;
public class factorial {
    

public static long  Binomialcofficient(long n,long r) {
long N_factorial = factorial(n);
long r_factorial = factorial(r);
long n_rfactorial =factorial(n-r);
long ans = (r_factorial*n_rfactorial);
    return N_factorial/ans;
}
    public static long factorial( long n){
        int factor=1;
        for(int i =1;i<=n;i++){
            factor = factor*i;
            
        }
        return factor;
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number ");
        // long number = sc.nextLong();
        // long ans = factorial(number);
        // System.out.println("factorial is  "+ ans);
       long ans= Binomialcofficient(4,5);
       System.out.println(ans);
       System.out.println(factorial(10)
       );

    }
}
