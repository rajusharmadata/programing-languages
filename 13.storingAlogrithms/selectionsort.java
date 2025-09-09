// this is a selectionSort time complixity  0(n^2);
public class selectionsort {
    public static void selectionSort(int arr[]){

         for(int i = 0;i<arr.length-1 ; i++){
            int minpos = i;
          for(int j = i+1;j<arr.length;j++){
            if(arr[minpos]>arr[j]){
                minpos = j;
            }
           
          }
          // Swap
          int temp = arr[minpos];
          arr[minpos] = arr[i];
          arr[i] = temp;

         }
    }
    public static void printarr(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main (String[]args){
    int arr[] = {5,4,1,3,2};
    selectionSort(arr);
    printarr(arr);
    
    }
}
