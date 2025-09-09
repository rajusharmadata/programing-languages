import java.util.*;
public class basic2D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int [3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        // input of 2D array
        for(int i = 0;i<n;i++){// Denoted the row
            for(int j = 0;j<m;j++){// Denoted the column
              matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        // output 
        for(int i = 0;i<n;i++){// Denoted the row
            for(int j = 0;j<m;j++){// Denoted the column
              System.out.print(matrix[i][j] + " ");
            } 
            System.out.println();
        }
    }
}