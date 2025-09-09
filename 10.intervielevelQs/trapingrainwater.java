/* traping Rainwater
 given n non - negative integers repersenting an elvative map where the 
width of each hight bar is 1 compute how much water it can trap after raining ;
*/

public class trapingrainwater {

    public static int trapedrainwater(int hight[]) {
        int n = hight.length;

        // calculate the left max boundary - array

        int leftMax[] = new int[hight.length];
        leftMax[0] = hight[0];
        for (int i = 1; i < hight.length; i++)
         {
            leftMax[i] = Math.max(hight[i], leftMax[i - 1]);
        }
        // caluculate the right max boundary- arry 
        int rightMax[] = new int[hight.length];
        rightMax[n - 1] = hight[n - 1]; 
        for (int i = n - 2; i >= 0; i--)
         {
            rightMax[i] = Math.max(hight[i], rightMax[i + 1]);
        }
        int trapedWater = 0;
        for (int i = 0; i < n; i++)
         {  // waterlevel = min (leftmax ,rightmax)
            int waterlevl = Math.min(leftMax[i], rightMax[i]);
            // traped water = trpedwater + (waterleve - hight)
            trapedWater += waterlevl - hight[i];
        }
    

        return trapedWater;
    }

    public static void main(String[] args) {
        int hight[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trapedrainwater(hight));
    }
}
