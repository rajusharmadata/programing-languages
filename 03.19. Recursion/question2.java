
/*
 * print number from n to 1 increseing order
*/
public class question2 {
    public static void printincr(int n){

        if(n==1){
            System.out.print(n+ " ");
            return;
        }
        printincr(n-1);
        System.out.print(n+ " ");

    }
 public static void main(String[] args) {
    printincr(5);
    System.out.println();
 }
    
}

