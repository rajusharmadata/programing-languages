/*
 * for a given  a set of strings print largest string
 * input -- [apple ,mango ,bannana]
 */
public class question3 {
    
    public static void main(String[] args) {
        String fruts[] = {"apple" ,"mango" ,"bannana"};
        String largest = fruts[0];
        for(int i = 1;i<fruts.length;i++){
           if(largest.compareTo(fruts[i])<0){
            largest = fruts[i];
           }
        }
        System.out.println(largest);

    }
}
