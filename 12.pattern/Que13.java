public class Que13 {
    public static void Hoolow_Rhombus(int n){
        // outer loop 
        for(int i =1;i<=n;i++){
            // spaces
            for(int j=1; j<=(n-i);j++){
                System.out.print(" ");

            }

            // stars 0r holo rectangale
            for(int j=1;j<=n;j++){
                if(i==1 || i ==n || j==1|| j==n ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        Hoolow_Rhombus(5);
    }
}
