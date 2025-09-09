public class solution2 {
// time complexity - 0(n^2)
    /*public static int calculatesum(int matrix[][], int row ){
        int sum = 0;
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(i==row){
                    sum+= matrix[i][j];
                }
            }
        }
        return sum;
    }
        */
       
    /**
     * 
     */
    public static void main(String[] args) {
        int matrix[][] =  { {1,4,9},{11,4,3},{2,2,3} };
        int row = 1;
        // System.out.println(calculatesum(matrix, row));
        int sum = 0;
        // target second row
        for(int i = 0;i<matrix[0].length;i++){
            sum += matrix[row][i];
        }
        System.out.println(sum);

    }
}