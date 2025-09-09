// constractions hierarchy

public class canstractions {
    public static void main(String[] args) {
        mustange m = new mustange();
        // Animal -> Horse -> mustage --- hierarchy
    }
    
}

abstract class  Animal {
    // Animal constructors
    Animal(){
        System.out.println("Animal constructors is called");
    }
    
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructors is called");
    }
    
}
class mustange extends Horse{
    mustange(){
        System.out.println("mustange is called");
    }
}