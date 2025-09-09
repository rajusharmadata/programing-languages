import java.util.*;
// decimal to binary 
public class binarytodecimala{

    public static void binarytodecimal(int n) {
        int dec = 0;
        int pow = 0;
        int binary =n;

        while (n > 0) {
            int lD = n % 10;
            dec = (dec + lD * (int) (Math.pow(2, pow)));

            pow++;
            n = n / 10;
        }
        System.out.println("binary"+ binary +" = " +dec);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary number");
        int n = sc.nextInt();
        binarytodecimal(n);

    }
}
