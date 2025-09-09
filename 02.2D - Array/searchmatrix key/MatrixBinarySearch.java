public class MatrixBinarySearch {
    // Method to perform binary search on a row
    public static boolean binarySearchRow(int[] row, int key) {
        int left = 0;
        int right = row.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2; // Avoid overflow with (left + right) / 2
            if (row[mid] == key) {
                return true; // Key found
            } else if (row[mid] < key) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return false; // Key not found in this row
    }
    
    // Main search method
    public static void searchKey(int matrix[][], int key) {
        for (int row = 0; row < matrix.length; row++) {
            // Perform binary search on each row
            if (binarySearchRow(matrix[row], key)) {
                System.out.println("Key is found in row " + row);
                return; // Exit once the key is found
            }
        }
        System.out.println("Key is not found in the matrix.");
    }

    public static void main(String[] args) {
        int matrix[][] = { 
                            {10, 20, 30, 40},
                            {15, 25, 35, 45},
                            {27, 29, 37, 48},
                            {32, 33, 39, 50}
                         };
        int key = 33;
        searchKey(matrix, key);
    }
}