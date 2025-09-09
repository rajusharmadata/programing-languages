// ask as google and adobe and microsoft and apple

import java.util.*;

public class spiralmatrix {
    public static void spiralmatrix(int matrix[][]){
        int strRow = 0;
        int strCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length -1;
        while (strRow<=endRow && strCol<= endCol ) {
            // top
            for(int j = strCol;j<=endCol;j++ ){
                System.out.print(matrix[strRow][j] + " ");
            }
            // right
            for(int i =  strRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol] + " ");
            }
            // bottom
            for(int j = endCol-1;j>=strCol;j--){
                if(strRow == endRow){
                  break;
                }
                System.out.print(matrix[endRow][j]+ " ");

            }
            // left
            for(int i = endRow-1;i>=strRow+1;i--){
                if(strCol == endCol){
                    break;
                }
                System.out.print(matrix[i][strCol]+ " ");
            }
            // updation
            strRow++;
            strCol++;
            endRow--;
            endCol--;
            
          
        }
        System.out.println();
    }
  
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}
                        

                        };
                        spiralmatrix(matrix);
    }
}
