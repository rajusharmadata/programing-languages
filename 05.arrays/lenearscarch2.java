public class lenearscarch2 {
    
// for String 

        public static int lenearscarch(String name[],String key){
            for(int i = 0;i<name.length;i++){
               if(name[i] == key){
               
                    return i;
                }
             }   
                return -1;
        }
        public static void main(String[] args) {
            String name[] ={"raju","shivam","rahul","niraj","rohit"};
            String key = "rohit";
           
            int index =  lenearscarch(name,key);
            if(index == -1){
                System.out.print("Not  found :)");
            }else{
                System.out.println("index is " + index);
            }
        }
    }
    

