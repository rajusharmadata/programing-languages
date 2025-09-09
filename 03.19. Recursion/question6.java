/*
 * question 6
 * check if given array is sorted in assending order  or not.  
 */
public class question6 {
    public static boolean sorted(int arr[] ,int i){
        // base case 
         if(i == arr.length-1){
            return true;
         }

         if(arr[i] >arr[i+1]){
            return false;
         }

         return sorted(arr, i+1);
    }
    public static void main(String [] args){
        int arr[]  = {6};
       System.out.println( sorted(arr, 0));
    }
    
}
