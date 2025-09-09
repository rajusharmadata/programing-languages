
public class setandget {
    public static void main(String[] args) {
        // create a object
        Book p1 = new Book();

        // argument pass set book name
        p1.Setbookname("british lenguwa");
        // print book name help with getBookfunction
        System.out.println(p1.getBookname());
        p1.setnofbooks(4);
        System.out.println(p1.getnofbooks());

    }
}
// class - blue print of object

class Book{
    private String Bookname ;
    private int nofbook;
    // set book name (seter)
    void Setbookname(String bookname){
      Bookname = bookname;// this.bookname denote kar raha hai jo parameter aa raha o
    }
    // get book name (geter)
    String getBookname(){
        return this.Bookname ;
    }
    // set nofbook
    void setnofbooks(int books){
        nofbook = books;
    }
    // get nofbooks
    int getnofbooks(){
        return this.nofbook;
    }
}
