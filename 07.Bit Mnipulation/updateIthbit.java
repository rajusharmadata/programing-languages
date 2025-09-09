
public class updateIthbit {
    // Aprocha no 1
    /*  public static int Clearithbit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }
    public static int setithbit(int n ,int i){
        int bitMask = 1<<i;
        return n|bitMask;
    }

    public static  int updateIthbit(int n,int i ,int newbit){
        if(newbit == 0){
            return Clearithbit(n, i);
        }else{
            return setithbit(n, i);
        }
    }

*/
// Aproch 2
public static int Clearithbit(int n, int i) {
    int bitMask = ~(1 << i);
    return n & bitMask;
}
public static  int updateIthbit(int n,int i ,int newbit){
    
       n = Clearithbit(n, i);
       int bitMask = newbit<<i;
       return n |bitMask;
        
    
}
       public static void main(String[] args) {
        System.out.println(updateIthbit(10,2,1));
    }
}



