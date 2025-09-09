// private Access Modifier ko ham access sirf class ke ander hi kar saket hai  usek bhar nahi

class privateExaple {
  private int a = 10;

  private void show() {
    System.out.println("Private: a = " + a);
  }

  public static void main(String[] args) {
    privateExaple Exp = new privateExaple();
    Exp.show();// yaha par ham access kar sakte hai kyu ki same class ke ander me access kar rahe hai

  }
}
