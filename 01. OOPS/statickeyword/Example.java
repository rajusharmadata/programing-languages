public class Example {

    public static void main(String [] args){
        School s1 = new School();
        s1.scname = "raju";


        School s2 = new School();
        System.out.println(s2.scname);

        School s3 = new School();
        System.out.println(s3.scname);
    }
}

class School{
    String name ;
    int roll;

    static String scname;

    // seter 
    void setname(String name){
        this.name = name;
    }

    // getter
    String getname (){
        return this.name;
    }
}