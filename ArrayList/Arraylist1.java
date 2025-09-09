import java.util.ArrayList;
public class Arraylist1 {
  public static void main(String[] args) {
    // integer is dente the type of the ArrayList

  ArrayList<Integer> list = new ArrayList<>();
  // HOW Add The value in ArrayList
  list.add(1); // It is take 0(1) time complexcity ....
  list.add(2);//it is add the value

  //It is use to set the value on particuler index  1==>denote the index & 9===>is denote the value
  list.add(1, 9);// it mean first index pe 9 daal do  // it take 0(n) Time complexity ...
  // How to get the value in ArrayList
  list.get(0); //0==> is denote the index & and the index 0 value is 1
  // How to remove the value in ArrayList
  list.remove(1);
}
}
