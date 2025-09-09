/*
 * given a rout containing 4 directions (E,W,N,S) find the shorted path to reach destination 
 * "WNEENESENNN"
 */
public class question2 {
    public static float FindShortedPath(String path){
        int x = 0,y = 0;
        for(int i = 0;i<path.length();i++){
            if(path.charAt(i)== 'N'){
                y++;
            }else if(path.charAt(i) == 'S'){
                y--;
            }else if(path.charAt(i) == 'E'){
                x++;
            }else{
                x--;
            }
            
        }
        // displacement formula 
        int x2 = x*x;
            int y2 = y*y;
            return (int)Math.sqrt(x2+y2);
    }
    
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(FindShortedPath(str));

    }
}
