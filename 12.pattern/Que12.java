public class Que12 {
public static void solidRhomBus(int n){
    // outer loop
    for(int i=1;i<=n;i++){

        // inner loops
        
        // space
        for(int j =1;j<=(n-i);j++){
            System.out.print(" ");
        }
        // stars
        for(int j=1;j<=n;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        solidRhomBus(5);
    }
}
