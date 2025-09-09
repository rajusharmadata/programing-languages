// array is work that call by refrence 
public class basic2 {
public static void update(int marks[]){
    for(int i=0;i<marks.length;i++){
        marks[i] = marks[i]+i;
    }
}
    public static void main(String [] args){
        int marks [] = {97,98,99};
        update(marks);


        //print the my marks 
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
    }
}