
public class abstraction {
    public static void main(String[] args) {
        Horese h = new Horese();
        h.eat();
        h.walk();
        
        cheake c = new cheake();
        c.eat();;
        c.walk();
        System.out.println(c.color);
    }
}

 abstract class Animal{
    String color;
    // constr
    Animal(){
        color = "brown";
    }
    void eat(){
        System.out.println("eats ");
    }
    // Give a idea  in walk 
    abstract void walk();
}
 // implement of the walk idea 
class Horese extends Animal{
    void changecolor(){
        color = "black brown";
    }
    void walk(){
        System.out.println("Hore walk 4 leags");
    }
}
 // implement of the walk idea 
class cheake extends Animal{
    void changecolor(){
        color = "Yellow";
    }
    void walk(){
        System.out.println("chicken walk  2 legs");
    }
}
