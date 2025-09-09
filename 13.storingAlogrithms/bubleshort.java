public class bubleshort {
    // oprtimise solution
    public static void BubleSort(int arr[]) {
        for (int tern = 0; tern < arr.length - 1; tern++) {
            boolean swap = false;
            
            for (int i = 0; i < arr.length - 1 - tern; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    swap = true;
                }
            }
            // this term is optimise the code. # this case timecomplixity = 0(n)
            if (!swap) {
                 break;
            }
           
           
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5 };
        BubleSort(arr);
        
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
