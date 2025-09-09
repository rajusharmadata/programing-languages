public class reversearray {
    // this is reverse arry 
    // that time complixity is O(n)
    // and space complixity is O(1)
    public static void reverse(int arr[]){
        int first = 0; 
        int last = arr.length-1;

        while (first<last) {
            int temp = arr[last];
           arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("before reverse array ");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        reverse(arr);
        System.out.println("After reverse array ");
        for(int i = 0;i<arr.length;i++){
         System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}