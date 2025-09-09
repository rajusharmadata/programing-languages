// Question - using following sorting algorithms to sort in array in Decending order 
// [3,6,2,1,8,7,4,5,3,1]

public class selectionsort {
     // print array function 
     public static  void printarr(int[]arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " " );
        }
        System.out.println();
    }
    // selection sort --> pick the smallest element and push the starting postion 
    public static void Selectionsort(int arr[]){
        // find smallest element 
        for(int i = 0;i<arr.length;i++){
            int small = i; // that is  element jo cheak jo find the smallest element 
            for(int j =i+1;j<arr.length;j++){
                if(arr[small]>arr[j]){
                    small = j;
                }
            }
            // swap the current postion par smalleset element 
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String [] args){
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        System.out.println("before sorting ");
        printarr(arr);
        System.out.println("after sorting ");
        Selectionsort(arr);
        printarr(arr);

    }
}
