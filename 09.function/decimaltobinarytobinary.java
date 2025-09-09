public class decimaltobinarytobinary {

public static void decimaltibin(int n){
     int rem = 0;
     int binary =0;
     int pow =0;
     int dec = n;
     while(n>0){
        rem = n%2;
        n=n/2;
        binary = binary+rem*(int)Math.pow(10, pow);
        pow++;

     }
     System.out.println("decimal" + dec + " = " + binary);
}

    public static void main(String args[]) {
     decimaltibin(7);
    }
}