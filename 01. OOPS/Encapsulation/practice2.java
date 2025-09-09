
public class practice2{
    public  static void main(String [] args){
        Circle ce = new Circle();

    }
}
public class Shape {
    protected void display() {
    System.out.println("Display-base");
    }
    }
    // Circle.java
    public class Circle extends Shape {
        /*
         * < <a
         */
        @Override
     public void display() {
    System.out.println("Display-derived");
    }

    @Override
    public String toString() {
        return "Circle []";
    }
    }
