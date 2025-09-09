/*
    question 1.
 * print number from n to 1 decreasing order
 * 
 */
public class question1 {
  public static void decreasingordernumberprint(int n){
        // base case 
        if(n==1){
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        // inner function ko call kare rahe hai'
        decreasingordernumberprint(n-1);
  }

    public static void main(String[] args) {
        decreasingordernumberprint(5);
        System.out.println();

        
    }
}