
/* That is how to work backtracking */
public class ChangeArr {
    public static void changearr(int arr[],int i,int val){
        // Base case
        if(i == arr.length){
            Printarr(arr);
            return;
        }
        // kaam
        arr[i] = val;
        changearr(arr, i+1, val+1);

        // backtracking  or chnage the value
        arr[i] = arr[i]-2;
    }

    public static void Printarr(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        changearr(arr, 0,1);
        Printarr(arr);
    }
}
