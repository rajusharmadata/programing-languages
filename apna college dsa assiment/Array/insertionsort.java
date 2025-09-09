/*
// Question - using following sorting algorithms to sort in array in Decending order 
// [3,6,2,1,8,7,4,5,3,1]

 */

public class insertionsort {

    public static void insertionSort(int [] arr){
        for(int i = 1;i<arr.length;i++){
            int curr = i;
            int prev = i-1;

            // main condition 
            while (prev>=0 && arr[prev] >curr) {
                arr[prev + 1] = arr[prev] ;
                prev--; 
            }
            // add current element
            arr[prev+1] = curr;
        }
    }
   public static void printarr(int [] arr){
    for(int i = 0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
    }
    System.out.println();
   }

   public static void main(String [] args){
       int arr[] = {3,6,2,1,8,7,4,5,3,1};
       System.out.println("before sorting ");
       printarr(arr);
       System.out.println("after sorting ");
       insertionSort(arr);
       printarr(arr);

   }
}


