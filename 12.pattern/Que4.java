import java.util.*;
public class Que4 {
    public static void main(String[]args){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        char ch = 'A';
        System.out.println("Enter number of times");
        int n = sc.nextInt();
        for(int i =1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }
}
