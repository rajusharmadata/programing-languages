/*
 * cheak if number is a power of 2 or not
 */
public class question2 {
    public static boolean isPower(int n){
        return (n&(n-1))==0;
    }
    public static void main(String[] args) {
        System.out.println(isPower(7));
        // true - matlab ki 2 ka power hai 
        
    }
}
