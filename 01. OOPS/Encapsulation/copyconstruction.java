// This code demonstrates the difference between shallow and deep copy constructors in Java

public class copyconstruction {
    public static void main(String[] args) {
        // Create the first student object and initialize its properties
        // Demonstrates creating an object using default constructor and then setting its values
        Student s1 = new Student();
        s1.name = "raju";
        s1.roll = 587;
        s1.password = "rrrrr";

        // Initialize marks array for the first student
        // Showing how array elements can be set individually
        s1.marks[0] = 478;
        s1.marks[1] = 100;
        s1.marks[2] = 2257;

        // Create a second student object using the copy constructor
        // This demonstrates how to create a new object with the same properties as another object
        Student s2 = new Student(s1);
        System.out.println(s2);

        // Change the password of the second student
        // This shows that primitive and reference fields can be modified independently
        s2.password = "xyes";

        // Modify the original object's marks
        // This demonstrates the importance of deep vs shallow copying
        s1.marks[0] = 8888;

        // Print the marks of the second student to show the copying mechanism
        for(int i = 0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
    }
}

// Student class with multiple constructors and copy constructor implementation
class Student {
    // Class fields to store student information
    String name;
    int roll;
    String password;
    int marks[];

    // Commented out Shallow copy constructor
    // In a shallow copy, reference types (like arrays) are copied by reference
    // This means changes to the original object's array would affect the copied object
    /*
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;  // This creates a reference to the same array
    }
    */

    // Deep copy constructor
    // Creates a new array and copies each element individually
    // This ensures that modifications to the original object do not affect the copied object
    Student(Student s1){
        marks = new int[3];  // Create a new array
        this.name = s1.name;
        this.roll = s1.roll;

        // Copy each array element manually
        for(int i = 0; i<3; i++){
            this.marks[i] = s1.marks[i];
        }
    }

    // Parameterized constructor with name
    // Demonstrates constructor overloading
    Student(String name){
        this.name = name;
        marks = new int[3];
    }

    // Default (no-argument) constructor
    // Initializes the marks array
    Student(){
        System.out.println("Constructor is called...........");
        marks = new int[3];
    }
}
