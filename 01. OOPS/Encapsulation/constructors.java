
public class constructors {

    public static void main(String[] args) {
        Student p1  = new Student();
        Student p2 = new Student("raju");
        Student p3 = new Student(56);
    }
}

class Student {
    String name ;
    int roll;

    // Non parameterzie constructors
    Student(){
        System.out.println("constructors is called ...");
    }
    // parameteze constructors
    Student(String name){
        this.name  = name;
    }
    // integer type parameteze constructors
    Student(int roll){
       this.roll = roll;
    }
}
