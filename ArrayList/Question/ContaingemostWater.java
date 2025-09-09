import java.util.*;;


public class ContaingemostWater {
  // Brutforce Approach
  public static int MostWatercontain(ArrayList<Integer> list) {
    int maxWater = Integer.MIN_VALUE;
    for (int i = 0; i < list.size(); i++) {
      for (int j = i + 1; j < list.size(); j++) {
        int length = Math.min(list.get(i), list.get(j));
        int width = j - i;
        int waterVolume = length * width;
        if (waterVolume > maxWater) {
          maxWater = waterVolume;
        }
      }
    }
    return maxWater;
  }
  // optimize Approach
  // Two pointer Approach
  public static int MostWater(ArrayList<Integer> list) {
    int maxWater = Integer.MIN_VALUE;
    int Lp = 0;
    int Rp = list.size()-1;

    while (Lp<Rp) {
      int hight = Math.min(list.get(Lp), list.get(Rp));
      int width = Rp - Lp;
      int water = hight * width;
      maxWater = Math.max(maxWater, water);
      // check the hight
      if (list.get(Lp) < list.get(Rp)) {
        Lp++;
      } else {
        Rp--;
      }
    }
    return maxWater;
  }
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(8);
    list.add(6);
    list.add(2);
    list.add(5);
    list.add(4);
    list.add(8);
    list.add(3);
    list.add(7);
    System.out.println(list);
    System.out.println(MostWater(list));
  }
}
