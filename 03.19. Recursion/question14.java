/*
 * problem 14 -- Binary String
 * print all binary string of size N without consective ones.
 * 
 * Aask in Pytam 
 */
public class question14 {
    public static void printBinarystring(int n ,int lastplace , String str ){
        // base case
        if(n==0){
            System.out.println(str);
            return;
        }

        // kaam
        printBinarystring(n-1, 0 , str+"0");
        if(lastplace == 0){
            printBinarystring(n-1, 1 , str+"1");
        }
    }
    public static void main(String []args){
        printBinarystring(3, 0, "");
    }

}
