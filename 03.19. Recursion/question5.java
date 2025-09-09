/*
 * question 5
 * print fibonacci number 
 */
public class question5 {
    public static int fib(int n){
        if (n == 0 || n == 1){
            return n;// base case
        }
        
        int fibN_1 = fib(n-1);
        int fibN_2 = fib(n-2);
         int fibN= fibN_1+ fibN_2;
         return  fibN;
    }
    public static void main(String [] args){
        System.out.println(fib(25));
    }
    
}
