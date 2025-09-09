public class Main {
    

    // This function prints the elements of the array.
    // It takes an integer array as input and prints each element followed by a space.
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " "); // Print each element of the array
        }
        System.out.println(); // Move to the next line after printing the array
    }

    // The main merge sort function which sorts the array recursively.
    // It takes the array, the starting index (si), and the ending index (ei) as input.
    public static void mergesort(int arr[], int si, int ei){
        // Base case: if the start index is greater than or equal to the end index, 
        // the array has only one element or no elements, so no need to sort.
        if(si >= ei){
            return;
        } 

        // Calculate the middle index to divide the array into two halves.
        int mid = si + (ei - si) / 2;

        // Recursively sort the left half of the array.
        mergesort(arr, si, mid);

        // Recursively sort the right half of the array.
        mergesort(arr, mid + 1, ei);

        // Merge the two sorted halves into a single sorted array.
        merge(arr, si, mid, ei);
    }

    // This function merges two sorted subarrays into one sorted array.
    // The first subarray is arr[si...mid], and the second subarray is arr[mid+1...ei].
    public static void merge(int arr[], int si, int mid, int ei){
        int i = si;         // Pointer for the left subarray (starts at si).
        int j = mid + 1;    // Pointer for the right subarray (starts at mid+1).
        int k = 0;          // Pointer for the temporary array.

        // Create a temporary array to store the merged result.
        int temp[] = new int[ei - si + 1];

        // Compare elements from both subarrays and copy the smaller one into temp[].
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++]; // Copy the element from the left subarray.
            } else {
                temp[k++] = arr[j++]; // Copy the element from the right subarray.
            }
        }

        // If there are remaining elements in the left subarray, copy them to temp[].
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // If there are remaining elements in the right subarray, copy them to temp[].
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy the sorted elements from temp[] back into the original array (arr[]).
        for(k = 0, i = si; k < temp.length; k++, i++){
            arr[i] = temp[k]; // Copy each element from temp to arr.
        }
    }

    // The main function where execution starts.
    public static void main(String [] args){
        int arr[] = {6, 3, 9, 5, 2, 8}; // Input array
        printArr(arr); // Print the array before sorting

        // Call the merge sort function to sort the array.
        mergesort(arr, 0, arr.length - 1);

        printArr(arr); // Print the array after sorting
    }
}
