import java.util.*;
// multi dimentionArraylist
public class code {

  public static void main(String[] args) {
  // multi dimentionArraylist syntex rules

  ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

  ArrayList<Integer> list1 = new ArrayList<>();
  list1.add(1);
  list1.add(2);
  list1.add(5);

  ArrayList<Integer> list2 = new ArrayList<>();
  list2.add(4);
  list2.add(5);
  list2.add(8);

  mainList.add(list1);
  mainList.add(list2);
  System.out.println(mainList);
  System.out.println(list1);
  System.out.println(list2);

  // printing with loop
  for (int i = 0; i < mainList.size(); i++) {
    ArrayList<Integer> currentList = mainList.get(i);
    for (int j = 0; j < mainList.get(i).size(); j++) {
      System.out.print(mainList.get(i).get(j) + " ");
    }
    System.out.println();
  }


}

}
