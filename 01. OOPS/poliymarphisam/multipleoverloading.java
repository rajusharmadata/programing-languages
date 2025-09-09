// This is the main class where we demonstrate method overloading
public class multipleoverloading {
    // Method Overloading:
    // Method overloading is a type of compile-time polymorphism,
    // where multiple methods with the same name have different parameter lists.

    public static void main(String[] args) {
        // Creating an instance of the `calculatar` class
        calculatar c = new calculatar();

        // Calling the first overloaded method that takes two integers
        System.out.println(c.sum(4, 5)); // Output: 9

        // Calling the second overloaded method that takes two float values
        System.out.println(c.sum((float) 4.3, (float) 3.3)); // Output: 7.6

        // Calling the third overloaded method that takes three integers
        System.out.println(c.sum(4, 5, 7)); // Output: 16
    }
}

// Class `calculatar` that contains overloaded methods for `sum`
class calculatar {
    // Overloaded method 1: Accepts two integers and returns their sum
    int sum(int a, int b) {
        return a + b;
    }

    // Overloaded method 2: Accepts two floats and returns their sum
    float sum(float a, float b) {
        return a + b;
    }

    // Overloaded method 3: Accepts three integers and returns their sum
    int sum(int a, int b, int c) {
        return a + b + c;
    }
}
