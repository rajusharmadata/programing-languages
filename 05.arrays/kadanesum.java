package arrays;

public class kadanesum {
    public static void kadanesum(int arr[]){
        int cs = 0;
        int mx = Integer.MIN_VALUE;
        for(int i= 0; i<arr.length;i++){
            cs = cs+arr[i];
            if(cs<0){
                cs = 0;
            }

            mx = Math.max(mx, cs);
        }
        System.out.println("max sum of this arary"+"="+mx);
    }
 public static void main(String[] args) {
    int arr[] = {-2,-3,4,-1,-2,1,5,-3};
    kadanesum(arr);
 }
}
