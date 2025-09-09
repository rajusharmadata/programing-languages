// This is the main class where we demonstrate method overriding in action
public class Methodoverriding {
    public static void main(String[] args) {
        // Creating an instance of the subclass `deer`
        deer d1 = new deer();
        // Calling the `eat()` method on the `deer` object
        // This will execute the overridden `eat()` method in the `deer` class
        d1.eat(); // Output: eat grass

        // Creating an instance of the superclass `Animal`
        Animal d2 = new Animal();
        // Calling the `eat()` method on the `Animal` object
        // This will execute the `eat()` method in the `Animal` class
        d2.eat(); // Output: eat any thing
    }
}

// Base class `Animal` which contains a general `eat()` method
class Animal {
    // Method to describe eating behavior of an animal
    void eat() {
        System.out.println("eat any thing");
    }
}

// Subclass `deer` that extends the `Animal` class
class deer extends Animal {
    // Overriding the `eat()` method to specify that deer eat grass
    @Override
    void eat() {
        System.out.println("eat grass");
    }
}
