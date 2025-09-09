// Question - using following sorting algorithms to sort in array in Decending order 
// [3,6,2,1,8,7,4,5,3,1]


public class bubblesort{
    public static void Bubblesort(int[] arr){
        // First loop for iteration 
        for(int itern = 0;itern<arr.length;itern++){
            // inner loop for change swap and comprestion the element
            for(int i = 0;i<arr.length-1-itern;i++){
                // cheak the conditon and swap 
                if(arr[i] >arr[i+1]){
                    int temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;

                }
            }
        }
    }
    


    // print array function 
    public static  void printarr(int[]arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " " );
        }
        System.out.println();
    }
    public static void main(String [] args){
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        System.out.println("Before sorted ");
        printarr(arr);
        System.out.println("After sorted");
        Bubblesort(arr);
        printarr(arr);
    }
}