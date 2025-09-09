/*
 * Question 9.
 * power (x^n)
 */
public class problem9 {
    public static int power(int x,int  n){
        //base case 
        if (n == 1){
            return x;
        }
        int ans = x *power(x, n-1);
        return ans;
    }


    
    public static void main(String []args){
        int x = 3;
        int n = 3;
        System.out.println(power(x, n));
        
    }
}
