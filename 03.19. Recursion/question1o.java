/*
 * Question 10.
 * calculate power
 */
public class question1o {
    public static int Power(int x ,int n){
        // base case 
         if(n == 0){
             return 1;
         }
         int hlafsq = Power(x, n/2);
         int squar = hlafsq*hlafsq;
         if(n%2!= 0){
            squar = x*squar;
         }
        return squar;
    }
    public static void main(String [] args){
        System.out.println(Power(2, 5));
    }
}
