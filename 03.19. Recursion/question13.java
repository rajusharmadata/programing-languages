/*
 problem - friends pariring problem
 given n frinds each , one can remain single or can be paired up with some 
 other friends . each friend can be paired each friend can be paired only once .
 find out the total number of ways in which friends can remain single or can be paired up.
 */
public class question13 {
    public static int frindsPairs(int n){
        // base case 
        if(n == 0|| n==1){
            return n;
        }

        // choice 
        // single 
        int fnm1 = frindsPairs(n-1);

        // Double 
        int fnm2 = frindsPairs(n-2);

        int calculate  = (n-1)*fnm2;
        return fnm1+ calculate;
    }
 public static void main(String [] args){
    System.out.println(frindsPairs(3));
 }   
}
