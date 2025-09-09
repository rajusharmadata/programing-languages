

public class OOPS {
   public static void main(String[] args) {
     // static - asses stacefire]
     Pen p1 = new Pen();
     p1.Setcolor("black");
     System.out.println(p1.color);
     p1.tip(5);
     System.out.println(p1.tip);
     // clolor
     p1.color = "Yellow";
     System.out.println(p1.color);
    }
}


class Pen {
    String color;
    int tip;
    // color
    void Setcolor(String newcolor){
        color = newcolor;
    }
    void tip(int newtip){
        tip = newtip;
    }
}

// student
class Student{
    String name ;
    int age;
    float percentage;// cgpa
    void calculatepercntage(int phy,  int chem, int math ){
        percentage = (phy+chem+math);
    }

}
