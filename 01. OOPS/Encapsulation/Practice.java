
public class Practice {

    public static void main(String[] args) {
        Car c = new ElectricCar(); // You can create an ElectricCar object
        System.out.println(c.drive());
         // Should print "Driving electric car"


    }
}

class Automobile {
    protected String drive() { // Changed private to protected
        return "Driving vehicle";
    }
}

class Car extends Automobile {
    @Override
    protected  String drive() {
        return "Driving car";
    }
}

class ElectricCar extends Car {
    @Override
    public final String drive() { // Override the drive method
        return "Driving electric car";
    }
}
