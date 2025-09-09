// protected Access Modifer ke ander ham isko same package ke ander aur ham subclass (dusra class ke ander hame use kar sakte with the help of the import kar ke )

 class protectedExaple {
  protected String Name = "Myname";
  protected int Enroll = 23106001;
 protected void printmyidentity(){
  System.out.println("myname is :" +Name);
  System.out.println("My roll number is :" +Enroll);
 }

 public static void main(String [] args){
  protectedExaple exp = new protectedExaple();
  exp.printmyidentity();
  System.out.println("Access the name :"+exp.Name);

 }
}
