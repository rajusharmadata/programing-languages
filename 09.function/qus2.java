//WriteamethodnamedisEventhatacceptsanintargument.Themethodshouldreturntrueiftheargumentiseven,
//orfalseotherwise.Alsowriteaprogramtotestyourmethod


import java.util.*;
public class qus2 {


public static boolean Even(int n){
    if (n%2==0){
        return true;
    }else{
        return false;
    }
}
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number ");
    int num = sc.nextInt();
    if (Even(num)){
        System.out.println("Even");
    }else{
        System.out.println("odd");
    }
    
    }
}
