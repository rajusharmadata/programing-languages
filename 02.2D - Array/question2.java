import java.util.Scanner;
// maximum  and minmum +

public class question2 {
    public static void Max_min(int matrix[][]){
        int min_value= Integer.MAX_VALUE;
        int max_value= Integer.MIN_VALUE;

        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix.length;j++){
               if(min_value>matrix[i][j]){
                min_value = matrix[i][j];
               }
               if(matrix[i][j] > max_value){
                max_value = matrix[i][j];
               }

                }
            }
            System.out.println("max value of This matrix :"+ max_value);
            System.out.println("min valut of This matrix :"+ min_value);
        }
       
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int matrix[][] = new int [3][3];
        int m = matrix.length,n = matrix[0].length;
        // input 

        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        Max_min(matrix);
    
}
}
