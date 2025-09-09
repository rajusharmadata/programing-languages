public class primenumber {
//    public static boolean prime(int n){

//     if(n==2){
//         return true;
//     }

//     boolean is_prime = true;
//     for(int i =2; i<=n-1;i++){
//         if (n%i==0){
//             is_prime = false;
//             break;
//         }
//     }
//     return is_prime;
//    }

public static void is_prime(int n){
    for(int i =2;i<=n;i++){
        boolean ans = prime(i);
        if(ans == true){
            System.out.print(i + " ");
        }
    }
    System.out.println();
}






// optimige rule

public static boolean prime(int n){
    if(n==2){
        return true;
    }
    for(int i=2;i<= Math.sqrt(n);i++){
        if(n%i==0){
            return false;
           
        }
        
    }
    return true;
}
   public static void main(String args[]){
    boolean ans = prime(412);
    // if (ans == true){
    //     System.out.println("Given number is primenumber");
    // }else{
    //     System.out.println("Given numbe is not a primenumber");
    // }
    is_prime(100);// print 2 to 1oo tak ke prime number
   }
}
