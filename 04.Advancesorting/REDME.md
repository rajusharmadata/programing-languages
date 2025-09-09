## Mereg sort 
```
Let's do a dry run of this Merge Sort code using the input array {6, 3, 9, 5, 2, 8} step by step.

Initial Array:
{6, 3, 9, 5, 2, 8}

The array is passed to the mergesort(arr, 0, 5) function. The starting index (si) is 0, and the ending index (ei) is 5.
Step 1: First Call to mergesort(arr, 0, 5)
mid = 0 + (5 - 0) / 2 = 2 (calculate middle index).
The array is split into two parts: left (arr[0...2] = {6, 3, 9}) and right (arr[3...5] = {5, 2, 8}).
We recursively call mergesort(arr, 0, 2) for the left half and mergesort(arr, 3, 5) for the right half.
Step 2: Call to mergesort(arr, 0, 2)
mid = 0 + (2 - 0) / 2 = 1.
The left half is split into two parts: left (arr[0...1] = {6, 3}) and right (arr[2] = {9}).
We recursively call mergesort(arr, 0, 1) for the left half and mergesort(arr, 2, 2) for the right half.
Step 3: Call to mergesort(arr, 0, 1)
mid = 0 + (1 - 0) / 2 = 0.
The left half is split into two parts: left (arr[0] = {6}) and right (arr[1] = {3}).
We recursively call mergesort(arr, 0, 0) for the left half and mergesort(arr, 1, 1) for the right half.
Base Cases for mergesort(arr, 0, 0) and mergesort(arr, 1, 1):
Both calls hit the base case (si >= ei), so no further sorting is done.
Step 4: Call to merge(arr, 0, 0, 1) (Merging {6} and {3})
Left subarray: {6}, Right subarray: {3}.
Compare and merge:
3 < 6, so {3} is placed first in the temporary array.
{6} is placed next.
The array after merging is {3, 6, 9, 5, 2, 8}.
Step 5: Call to mergesort(arr, 2, 2)
Base case hit (si >= ei), so no further sorting is done for the element 9.
Step 6: Call to merge(arr, 0, 1, 2) (Merging {3, 6} and {9})
Left subarray: {3, 6}, Right subarray: {9}.
Compare and merge:
3 < 9, so {3} is placed in the temporary array.
6 < 9, so {6} is placed next.
Finally, {9} is placed.
The array after merging is {3, 6, 9, 5, 2, 8}.
Step 7: Call to mergesort(arr, 3, 5)
mid = 3 + (5 - 3) / 2 = 4.
The right half is split into two parts: left (arr[3...4] = {5, 2}) and right (arr[5] = {8}).
We recursively call mergesort(arr, 3, 4) for the left half and mergesort(arr, 5, 5) for the right half.
Step 8: Call to mergesort(arr, 3, 4)
mid = 3 + (4 - 3) / 2 = 3.
The left half is split into two parts: left (arr[3] = {5}) and right (arr[4] = {2}).
We recursively call mergesort(arr, 3, 3) for the left half and mergesort(arr, 4, 4) for the right half.
Base Cases for mergesort(arr, 3, 3) and mergesort(arr, 4, 4):
Both calls hit the base case (si >= ei), so no further sorting is done.
Step 9: Call to merge(arr, 3, 3, 4) (Merging {5} and {2})
Left subarray: {5}, Right subarray: {2}.
Compare and merge:
2 < 5, so {2} is placed first in the temporary array.
{5} is placed next.
The array after merging is {3, 6, 9, 2, 5, 8}.
Step 10: Call to mergesort(arr, 5, 5)
Base case hit (si >= ei), so no further sorting is done for the element 8.
Step 11: Call to merge(arr, 3, 4, 5) (Merging {2, 5} and {8})
Left subarray: {2, 5}, Right subarray: {8}.
Compare and merge:
2 < 8, so {2} is placed in the temporary array.
5 < 8, so {5} is placed next.
Finally, {8} is placed.
The array after merging is {3, 6, 9, 2, 5, 8}.
Step 12: Call to merge(arr, 0, 2, 5) (Merging {3, 6, 9} and {2, 5, 8})
Left subarray: {3, 6, 9}, Right subarray: {2, 5, 8}.
Compare and merge:
2 < 3, so {2} is placed first.
3 < 5, so {3} is placed next.
5 < 6, so {5} is placed next.
6 < 8, so {6} is placed next.
8 < 9, so {8} is placed next.
Finally, {9} is placed.
The array after merging is {2, 3, 5, 6, 8, 9}.
Final Sorted Array:
{2, 3, 5, 6, 8, 9}.

```

## quick sort dry run example
``` public class Main { // Class declaration

    // This function prints the elements of an array
    public static void printArr(int arr[]) {
        // Loop through the array and print each element followed by a space
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Print a new line after the array is printed
    }

    // This function implements the Quick Sort algorithm
    public static void quicksort(int arr[], int si, int ei) {
        // Base case: If the start index is greater than or equal to the end index, return (array is already sorted)
        if (si >= ei) {
            return;
        }

        // Partition the array and get the partition index
        int partindx = partition(arr, si, ei);

        // Recursively sort the left part (elements before the pivot)
        quicksort(arr, si, partindx - 1);

        // Recursively sort the right part (elements after the pivot)
        quicksort(arr, partindx + 1, ei);
    }

    // This function performs the partition step of Quick Sort
    public static int partition(int[] arr, int si, int ei) {
        int i = si - 1; // Pointer for elements smaller than the pivot
        int pivot = arr[ei]; // Choose the last element as the pivot

        // Traverse the array from start index to end index - 1
        for (int j = si; j < ei; j++) {
            // If the current element is less than or equal to the pivot, swap it with a smaller element
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        // Move the pivot to its correct position (i+1)
        i++;
        arr[ei] = arr[i];
        arr[i] = pivot;

        // Return the partition index
        return i;
    }

    // Main function
    public static void main(String[] args) {
        // Initialize an array
        int arr[] = {6, 3, 9, 5, 2, 8};

        // Call the Quick Sort function on the entire array
        quicksort(arr, 0, arr.length - 1);

        // Print the sorted array
        printArr(arr);
    }
}
``` 