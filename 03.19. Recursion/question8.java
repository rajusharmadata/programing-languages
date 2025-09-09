/*
 * question 7.
 * WAF to find the first lastoccurence of an element in array.
 * 
 */
public class question8 {
    public static int lastoccurenc(int arr[] , int key ,int i){
        // Base case
        // if(i==0){
        //     return i;

        // }
        // if(arr[i] == key){
        //     return i;
        // }
        
        //  return lastoccurenc(arr, key, i--);
       // Base case 
       if(i==arr.length){
        return -1;
       }
       int last = lastoccurenc(arr, key, i+1);

       if(last == -1 && arr[i]==key){
        return i;
       }
       return last;

        
        
    }
    public static void main(String [] args){
        int arr[] = {1,4,2,3,6,7,89,5};
        int key = 5;
        System.out.println(lastoccurenc(arr, key,0));
    }
}

