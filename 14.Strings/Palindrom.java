public class Palindrom {
    public static boolean CheckPalindrom(String str){
        // String ch = "";

      /*   for(int i = str.length()-1;i>=0;i--){
            ch+= str.charAt(i);
        }
        if(str == ch){
            return true;
        }else{
            return false;
        }
            */
            /* optimize solution  */
            int n = str.length();
            for(int i = 0;i<str.length()/2;i++){
                if(str.charAt(i)!=str.charAt(n-1-i)){
                    return false;
                }
            }
            return true;
    }
    public static void main(String[] args) {
        String str = "noon";
        if(CheckPalindrom(str)){
            System.out.println("given string is plindrom");
        }else{
            System.out.println("given string is not Plindrom");
        }
    }
}
