public class binarsearh {
    public  static int binary_search(int arr[],int key){
         int start = 0; 
         int end = arr.length-1;
         
         while (start<=end) {
            int mid = (start + end)/2;
            if(arr[mid]== key){
                return mid;
            }
            if(arr[mid]<key){
                start = mid +1;
            }else{
                end = mid - 1;
            }
         }
         return -1;
        }
    
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6,7,8,9,10};
        int key  = 1;
       System.out.println("my index is = " + binary_search(arr, key));
    }
}
