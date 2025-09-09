
/*
 * == checks if two references point to the same object (memory location).
.equals() checks if two objects have the same content
 */

public class stringcomprision {
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 =  new String("Tony");
        if(s1 == s2){
            System.out.println("Strings are equal");
        }else{
            System.out.println("String are not equal");
        }
        if(s1 == s3){
            System.out.println("Strings are equal");
        }else{
            System.out.println("String are not equal");
        }
        // use equals
        if(s1.equals(s3)){
            System.out.println("String is equal ");
        }else{
            System.out.println("String are not equal");
        }
    }
   
}
