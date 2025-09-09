public class basices {
    public static void bubleshort(int arr[]){
        // outer loop 
        for(int tern = 0;tern<arr.length-1;tern++){
            // inner loop 
            for(int j = 0; j<arr.length-1 -tern;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2,1};
        System.out.println("print the array");
        bubleshort(arr);
        for(int i = 1;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        }
    }
