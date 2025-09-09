public class multipleinheritance {
    public static void main(String[] args) {
        bear b = new bear();
        b.vage();
        b.novage(); 
    }
}

interface Herbirore {
    void vage();
}

interface carnivore {
    void novage();
}

class bear implements Herbirore,carnivore{
    public void vage(){
        System.out.println("eat vage");
    }
    public void novage(){
        System.out.println("non vage");
    }
}

