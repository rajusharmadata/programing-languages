public class subarray {
    public static void subarray(int arr[]) {
        int sub = 0;
        int large = Integer.MIN_VALUE;
        int minum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            // inner loop
           
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) 
                {
                    System.out.print(" " + arr[k] + " ");
                    sum = sum+arr[k];
                }           
                sub++;
                System.out.println();
                System.out.println( "sum "+sum);
                // find max valu 
                 if(sum>large){
                    large = sum;
                }      
                // find minum valu 
                if(minum>sum){
                    minum = sum;
                }
                
            }

        }
        System.out.println("how many make a sub array " + sub);
        System.out.println("large value of all subarray "+ large);
        System.out.println("minum value of all subarray "+ minum);

        
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        subarray(arr);
    }
}
