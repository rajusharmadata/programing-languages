public class kadanes {
    public static void kadeanesbreak(int arr[]) {
        int count = 0;
        int max = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                count++;
            }
        }
        if (count == arr.length) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            System.out.println("max vlaue is = " + max);
        } else {
            for (int i = 0; i < arr.length; i++) {
                cs = cs + arr[i];
                if (cs < 0) {
                    cs = 0;
                }

                max = Math.max(max, cs);
            }
            System.out.println("max sum of this arary" + "=" + max);
        }

    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        kadeanesbreak(arr);
    }
}
