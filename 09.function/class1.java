import java.util.*;
public class class1 {
    // that is int type of function and return integer
    public static int AddTwoNumber(int a,int b){// that a and b is  parameter
     return a+b;
    } 
    public static void main(String args[]){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        // function calling
     int sum =  AddTwoNumber(a, b);// taht is actual parameter // argument

     System.out.println("Sum = "+sum);
    }
}
