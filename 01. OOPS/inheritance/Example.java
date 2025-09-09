// Example of inhertence 

public class Example {
    
    public static void main(String[] args) {
        // fish shark = new fish();
        // shark.eat();

         man raju = new man();
         raju.walk();
    }
}
/*
 * 
 * 1. Single level inhertance 
 * 
// base class
class Animal {
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }

}
// Derived class / sub class
class fish extends Animal{
    int fish ;
    
     void swin(){
        System.out.println("swinms in water");
     }
    
}

 */


 // 2. multlevel inhertance 

 /*
  class Animal {
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }

 }

 class mameal extends Animal{
    int leg;
    void legs(int leg){
        this.leg = leg;
    }
 }

 class Dog extends mameal{
    void breads(){
        System.out.println("Dogs is breads........ ");
    }
 }
  */


  // 3.Hierarchial Inheritence

  /*
   class Animal{
    String Animal_name;

    void eat(){
        System.out.println("eats");
    }

    void breading(){
        System.out.println("breathing");
    }
  }

  // second class
   class mameal extends Animal{
    void walk(){
        System.out.println("walks...");
    }

   }
   class bird extends Animal{
    void fly(){
        System.out.println("fly...");
    }
   }


   */

   // Hybrid inheritance 

   // Base class  
   class Animal{
    String name;

    void eat(){
        System.out.println("eats");
    }
    void breading(){
        System.out.println("breadings");
    }
   }
   // derive class of Animal 
   class fish extends Animal{
    void swing(){
        System.out.println("Swing.................");
    }
   }
   // derive class of Animal 
   class Bird extends Animal{
    void fly(){
        System.out.println("fly...........");
    }
   }
   // derive class of Animal 
   class mameal extends Animal{
    void walk(){
        System.out.println("walks");
    }
   }

   // derive class of fish 
   class tuna extends fish{
    void colo(){
        System.out.println("colors is Red........");
    }
   }
   // derive class of Fish
   class shark extends fish{
    void shark(){
        System.out.println("This is shark class");
    }
   }
   // // derive class of bird
  class picacock extends Bird{
    void picacock(){
        System.out.println("picacock.........");
    }
  }
  // // derive class of mammels
  class dog extends mameal{
    void dog(){
        System.out.println("bhockta hai");
    }
  }
  // // derive class of mammels

  class man extends mameal{
    void man(){
        System.out.println("mammeal is mammeal");
    }
  }