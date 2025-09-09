import java.util.*;

public class Ques{
    // Search for an item & key
    public static boolean Search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) { // FIXED: Use matrix[i].length
                if (matrix[i][j] == key) {
                    System.out.println("Index is (" + i + ", " + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Index not found");
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3]; // 3x3 matrix
        int m = matrix.length, n = matrix[0].length;

        // Input matrix values
        System.out.println("Enter " + (m * n) + " elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int key = 7; // Key to search
        Search(matrix, key);

        sc.close(); // Close the scanner to prevent resource leak
    }
}
