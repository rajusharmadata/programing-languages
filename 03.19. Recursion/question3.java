/*
 * print the factorial of a number n .
 */
public class question3 {
    public static int printfact(int n){
        // base case 
        if(n==1){
            return 1;
        }
       int fN_1 =  printfact(n-1);
       int fN = n*fN_1;
       return fN;
        
    }
    public static void main(String [] args){
        
        System.out.println(printfact(5));
    }
    
}
