public class Diagonalsum {
    public static void Diagonalsum(int matrix[][]){
        int sum = 0;

        // brutforce aproach Timecomplexety 0(n^2)

        // for(int i = 0;i<=matrix.length-1;i++){
        //     for(int j = 0;j<=matrix[0].length-1;j++){
        //         if (i==j){
        //             sum+= matrix[i][j];
        //         }else if(i+j == matrix.length-1){
        //             sum+= matrix[i][j];
        //          }
        //     }
        // }
        // optimize aproche   Timecomplexety 0(n)
        for(int i = 0;i<=matrix.length-1;i++){
              // primary diagonal
                sum+=matrix[i][i];
                // secondary diagonal 
                //  how to find j
                // i+j = n-1;
                // j = n-1-i;
                // j = matrix.lenght-1-i;
                if(i+matrix.length-1-i==matrix.length-1){
                    sum+=matrix[i][matrix.length-1-i];
                }
            }
            System.out.println(sum);
           
        }
        // (/home/x/.ssh/id_ed25519)




     
    
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},

                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}
                        

                        };
                        Diagonalsum(matrix);
    }
}
