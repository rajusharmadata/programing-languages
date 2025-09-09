public class functionoverloading {
    /*
     function overloading depends upon the number of parameter
     
     */
    // this is function over loading _function name is same but no of parameter is deffrent 
    // public static int sum(int a,int b){
    //     return a+b;
    // }
    // public static int sum(int a,int b,int c){
    //     return a+b+c;
    // }





    // function overloading of defreant data type 
    // fun calculate a sum using integer data type
    public static int sum(int a,int b){
        return a+b;
    }
    // fun cal of sum for floating valut
    public static float sum(float a,float b){
        return a+b;
    }

public static void main(String args[]){
    System.out.println(sum(4,4));

    System.out.println(sum(4.0f,5.8f));
}
}