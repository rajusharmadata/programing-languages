package Strings;

public class findLetter {
    public static void FindLetter(String str){
        for(int i = 0;i<str.length();i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String str = "Raju sharma";
        FindLetter(str);
    }
}
