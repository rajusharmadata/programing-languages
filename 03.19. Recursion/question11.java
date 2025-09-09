/*
 Tilling problem 
 Given a "2 x n" board and tiles of size "2 x 1" count the number of ways to tile the given  board 
 using the 2 x 1tiles.
 (A tiles can either be placed Horizontally  or vertically )
 */
public class question11 {
    public static int TillingProblem(int n){
        // base case
         if(n == 0 || n == 1){
            return 1;
         }

         // verticale 
         int fnm1 = TillingProblem(n-1);

         //  Horizontly
         int fnm2 = TillingProblem(n-2);
         
         return fnm1+fnm2;

    }
    public static void main(String [] args ){
        System.out.println(TillingProblem(3));
    }

}
