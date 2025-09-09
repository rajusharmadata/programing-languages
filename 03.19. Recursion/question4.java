/*
question 4
  print sum first n natural number 
 */
public class question4 {
    public static int NaturalNumSum(int n){
        // base case 
        if(n==1){
            return 1;
        }
        int num = NaturalNumSum(n-1);
        int ans = n + num;
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(NaturalNumSum(5));
    }
    
}
