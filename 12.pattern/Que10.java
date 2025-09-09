public class Que10 {
    
    public static void diagonalElement(int n){
        // upper loop
        for(int i=1;i<=n; i++){
            // inner loop 
            for(int j=1;j<=i;j++){
                // base condition 
                if(i==j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        diagonalElement(5);
    }
}
