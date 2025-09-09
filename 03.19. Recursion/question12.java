/*
Remove Duplicate in a String 
"appnacollege" - // Aask at Google,Microsoft
 */
public class question12 {
    public static void removeDuplicate(String str,int indx ,StringBuilder newstr,boolean[] map){
        // Base case 
        if(indx == str.length()){
            System.out.println(newstr);
            return;
        }

        // Kaam 
        char currchar = str.charAt(indx);
        if(map[currchar-'a']==true){
            // Duplicate 
            removeDuplicate(str, indx+1, newstr, map);
        }else{
            map[currchar-'a'] = true;
            removeDuplicate(str, indx +1, newstr.append(currchar), map);
        }
    }
    public static void main(String [] args){
        String str = "appnacollege";
        removeDuplicate(str,0, new StringBuilder(""),new boolean[26]);
    }
}
