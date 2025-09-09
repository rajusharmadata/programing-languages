import java.util.*;
public class basic {
    
    // How to declear a arrays
    //dataType arrayName[] = new dataType[size];
    // new is basicaly look a memory location and take a memory give a memory
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[45];
      
        int number[] = {1,2,3,4,5};
        String fruits[] = {"rahul","raju","niraj","shivam" };
        
        System.out.println(fruits[0]);
        System.out.println(fruits[1]);
        System.out.println(fruits[2]);

        System.out.println("Enter marks");
       marks[0] =  sc.nextInt();
       System.out.println(marks[0]);
       // change the value
       marks[0]=68;
       System.out.println(marks[0]);
       // update the value 
       marks[0] = marks[0]+4;
       System.out.println("my update marks " + marks[0]);
  
//     how to find length of array
    System.out.println(marks.length);
}
}
