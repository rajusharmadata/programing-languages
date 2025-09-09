public class maxsumarray {

    public static void maxsubarray(int arr[]) {

        int large = Integer.MIN_VALUE;
        int prifix[] = new int[arr.length];
        int curent = 0;
        /*
         * for (int i = 0; i < arr.length; i++) {
         * // inner loop
         * 
         * for (int j = i; j < arr.length; j++) {
         * int sum = 0;
         * for (int k = i; k <= j; k++)
         * {
         * 
         * sum = sum+arr[k];
         * }
         * 
         * System.out.println();
         * System.out.println( sum);
         * // find max valu
         * if(sum>large){
         * large = sum;
         * }
         * 
         * 
         * }
         *  
         * }
         */
        prifix[0] = arr[0];
        for (int i = 1; i < prifix.length; i++) {
            prifix[i] = prifix[i - 1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            curent = 0;
            for (int j = i; j < arr.length; j++) {
                int end = j; 
                curent = start == 0 ? prifix[end] : prifix[end] - prifix[start - 1];
            }
            if (curent > large) {
                large = curent;
            }
        }

        System.out.println("Maxsub Array  " + large);

    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };                    
        maxsubarray(arr);

    }
}
