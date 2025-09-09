import Encapsulation.Shape;

class practice3 {
public static void main(String [] args){

}

}
public class Shape {
    void display() {
   System.out.println("Display-base");
   }
   }
   // Circle.java
      public class Circle extends Shape {
       /*
        * < <access modifier>
        */
       @Override
    public void display() {
   System.out.println("Display-derived");
   }
}
// it is possible  protected and public

