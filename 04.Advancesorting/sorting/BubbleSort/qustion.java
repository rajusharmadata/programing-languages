public class qustion {
  /*
   * Given an array of integers, sort it in non-decreasing order using Bubble Sort.

  Input

  n — number of elements (1 ≤ n ≤ 10^5)

  arr — list of n integers (|arr[i]| ≤ 10^9)

  Output

  The sorted array in non-decreasing order.

  Example

  Input
  n = 6
  arr = [5, 1, 4, 2, 8, 0]

  Output
  [0, 1, 2, 4, 5, 8]
   */
  // Bubble sort

  public static void BubbleSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      // inner loop for the comparestion each elements
      for (int j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] > arr[j+1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }

  // print array method
  public static void printArray(int arr[]) {
    for (int k = 0; k < arr.length; k++) {
      System.out.println(arr[k]);
    }
  }

  public static void main(String[] args) {
    int arr[] = { 5, 1, 4, 2, 8, 0 };
    BubbleSort(arr);
    printArray(arr);

  }
}

