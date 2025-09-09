// using inbilint  sort function in java 
import java.util.Arrays;
import java.util.Collections;
public class inbiltfunction {
    // print printarr is a functio to print the array 

    public static void printArr(Integer arr[]) {
        for (Integer i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer arr[] = { 5, 4, 1, 3, 2 };// int is peremetive type data hota hai 
        // Arrays.sort(arr); // sort the array in ascending order
        // printArr(arr); // print the array
        // Arrays.sort(arr, Collections.reverseOrder()); // sort the array in descending order
        // printArr(arr); // print the array
        // Arrays.sort(arr, 0, 3); // sort the array from 0 to 3 index in ascending order
        // printArr(arr); // print the array
        // Arrays.sort(arr, Collections.reverseOrder()); // sort the array in descending order
        // printArr(arr); // print the array
        // Arrays.sort(arr);
        Arrays.sort(arr,0,3);
        printArr(arr);
        Arrays.sort(arr, Collections.reverseOrder());
        printArr(arr);
        
      

    }
}
