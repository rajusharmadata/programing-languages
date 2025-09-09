public class Example {

    public static void main(String[] args) {
        Queen q = new Queen();
        q.move();
    }
}

interface chasePlayer{
    void move();
}

 class Queen implements chasePlayer{
  public void move(){
        System.out.println("up ,down,right ,left ,doagonal (in all four direction )");
    }
}
class Rook implements chasePlayer{
    public void move(){
          System.out.println("up ,down,right ,left ");
      }
  }
  class King implements chasePlayer{
    public void move(){
          System.out.println("up ,down,right ,left ,doagonal in left ");
      }
  }