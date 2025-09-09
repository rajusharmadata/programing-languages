/*
 which of the following is a correct statement (both in same package )
 1.  car c = new car();
 2.  vechical  v = new vechical();
 3. vechical v = new car();
 4. car c = vechical();// wrong 
 */

//  public class question4 {
 
//     public static void main(String[] args) {
//         car c = new car();
//         vechical v = new vechical();
//         // java ke andar ham child obj ka refernce parent ke refernce me assing kar sakte hai
//         vechical v1 = new car();
//         // car ke proprty ko accece nhi kar payenege kyu ki car ka reference nhi vehical ker ander 
//          v1.run();
//     }
//  }

//  class vechical {
//     void run(){
//         System.out.println("run");
//     }
//  }

//  class car extends vechical{
//     void car(){
//         System.out.println("car is run  ");
//     }
//  }

// question 6 
public class question4 {
      public static void main(String[] args) {
         vechical obj1 = new car();
         obj1.print1();// this errror is exits ...
      }
   
}

class vechical {
   void print(){
      System.out.println("base class...");
   }
}

class car {
   void print1(){
      System.out.println("derive class....");
   }

public static char[] drive() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'drive'");
}
}