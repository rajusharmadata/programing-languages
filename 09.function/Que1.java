import java.util.*;

public class Que1 {
    public static int multiply(int a,int b){
                int product = a*b;
                return product;
    }

    public static void main(String args[]){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
            int a = sc.nextInt();
         System.out.println("Enter Second  number");
        int b = sc.nextInt();

        int prdo = multiply(a, b);
        System.out.println("Product is "+ prdo);


        
    }
    
}
