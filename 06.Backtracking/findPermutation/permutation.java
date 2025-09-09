package findPermutation;
class permutation {
    public static void findpermuation(String str, String ans) {
        // Base case 
        if(str.length()==0){
            System.out.println(ans);
            return ;
        }

        // Recursion
        for(int i = 0;i<str.length();i++){
            char chr = str.charAt(i);
           // "abcde" = "ab" + "cd"  => abde
           String Newstr = str.substring(0, i) + str.substring(i+1,str.length());
           findpermuation(Newstr, ans+chr);
        }
      
    }

    public static void main(String args[]) {
        String str = "abc";
        String ans = "";
        findpermuation(str, ans);
    }
    

}