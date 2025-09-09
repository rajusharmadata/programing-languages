/*

    Search in Rotated sorted Array

    input : sorted rotated Array with distinct numbers (in ascending order it si rotated a pivot point find it is rotated a pivot point find The index of given element)
 */
public class question {
    public static int search(int arr[], int target, int si, int ei) {
        // Base case: if search interval becomes invalid
        if (si > ei) {
            return -1;
        }

        // Calculate mid-point
        int mid = si + (ei - si) / 2;

        // Check if the mid element is the target
        if (arr[mid] == target) {
            return mid;
        }

        // Determine which half is sorted
        if (arr[si] <= arr[mid]) { // Left half is sorted
            // Check if the target lies within this range
            if (arr[si] <= target && target < arr[mid]) {
                return search(arr, target, si, mid - 1);
            } else { // Otherwise, search in the other half
                return search(arr, target, mid + 1, ei);
            }
        } else { // Right half is sorted
            // Check if the target lies within this range
            if (arr[mid] < target && target <= arr[ei]) {
                return search(arr, target, mid + 1, ei);
            } else { // Otherwise, search in the other half
                return search(arr, target, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int index = search(arr, target, 0, arr.length - 1);
        System.out.println("Index of target " + target + " is: " + index);
    }
}
