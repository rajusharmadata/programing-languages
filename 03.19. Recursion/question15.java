/*
 * Problem -- Find the power using Recursion 
 */
public class question15 {
    public static int  power2(int a,int n){

    // This is my base case         
        if(n == 0){
            return 1;

        }   
        // Case --even 
        int halfpower = power2(a, n/2);
        int fullpower = halfpower*halfpower;
        
        // Case -- odd

        if(n%2!=0){
            return a*fullpower;
        }
        return fullpower;
    }
    public static void main(String[] args) {
        int a = 2;
        int n = 3;
        System.out.println(power2(a, n));
    }
}
