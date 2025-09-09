import java.util.*;

public class qus3 {

    public static boolean plaindrom(int n ){
        int remender;
        int number = n;
        int ans =0;
        while (n>0) {
        remender = n%10; 
        ans = ans*10+remender;
        n = n/10;
        
        }
       if(ans == number){
        return true;
       }
       else{
        return false;
       }
    }
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner var = new Scanner(System.in);
       
        int n = var.nextInt();

        if(plaindrom(n)){
            System.out.println("number is planidrom");
        }else{
            System.out.println("number in not planidrom");
        }
    }

}
