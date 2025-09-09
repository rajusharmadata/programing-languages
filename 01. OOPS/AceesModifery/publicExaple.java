// pubic  Access Modifier ko ham access ko kahi par access kar sakte hai like - same class,subclass and other package ke ander ham isko use kar sakte ahi 
public class publicExaple {
 public String name = "Myname";

 public void show(){
  System.out.println("Print the Name : " + name);
 }

 public static void main(String  [] args){
  publicExaple exp = new publicExaple();
  exp.show();
 }
}
