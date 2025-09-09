


/*
 * 1.check a number is odd & even
 * 
 */
import  java.util.*;
public class question1 {
public static void Evenodd(int n){
    int bitMask = 1;
    if((n & bitMask) == 0){
        System.out.println("Given number is even");
    }else{
        System.out.println("Given number is odd");
    }
}

public static void main(String[] args) {
    final Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int n = sc.nextInt();
    Evenodd(n);
   sc.close();
}
}
