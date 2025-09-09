public class largestnumber {
    public static int largestnumber(int number[]){
                int largest = Integer.MIN_VALUE;
             for(int i=0;i<number.length;i++){
                if(largest<number[i]){
                    largest = number[i];
                }
             }
            
             return largest;
            }
             public static int smallestNumber(int number[]){
                int smallest = Integer.MAX_VALUE;
                for(int i=0;i<number.length;i++){
                    if(smallest>number[i]){
                        smallest = number[i];
                        
                    }
                 } 
                 return smallest; 
             }
            
    
    public static void main(String [] args){
        int number[]={1,2,3,4,5,6,7};
       
      

        
        System.out.println("the largest value is :" +largestnumber(number));
        System.out.println("the minium value is :" + smallestNumber(number));


    }
}
