/*
 * question 7.
 * WAF to find the first occurence of an element in array.
 * 
 */
public class question7 {
    public static int firstoccurence(int arr[] , int key ,int i){
        // Base case
        if(i==arr.length){
            return -1;

        }
        if(arr[i] == key){
            return i;
        }
        return firstoccurence(arr, key, i+1);

        
        
    }
    public static void main(String [] args){
        int arr[] = {1,4,2,3,6,7,89,5};
        int key = 5;
        System.out.println(firstoccurence(arr, key, 0));
    }
}
