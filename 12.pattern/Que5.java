public class Que5 {

    public static void hollow_rectangular(int totrow, int totcolums){
        // outer loop 
        for(int i =1;i<=totrow;i++){

            // inner loop 
            for(int j =1; j<=totcolums;j++){
                // this is base condition 
                //  cell  (i,j)
                if(i==1||  i==totrow || j ==1 || j==totcolums){
                    // boundery cell 
                    System.out.print("*");

                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollow_rectangular(8, 15);
        
    }
}