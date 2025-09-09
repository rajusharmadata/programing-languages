public class solution3 {
    public static void FindTranspose(int matrix[][]){
        int col = matrix.length;
        int row = matrix[0].length;
        // create a new arr
        int arr[][] = new int[row][col];
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
             arr[j][i] = matrix[i][j];
            }
           
        }
    
    for(int i = 0;i<arr.length;i++){
        for(int j = 0;j<arr[0].length;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,5,6}};
        System.out.println("before Transpose matrix");
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Transpose of the matrix");

        FindTranspose(matrix);


    }
}

