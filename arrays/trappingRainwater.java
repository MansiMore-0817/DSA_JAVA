import java.util.*;


// Time complexity is O(n) i.e depends on the number of bars
public class trappingRainwater {
    public static int trappedRainwaterCalc(int height[]) {

        int n = height.length;
        // calculate left Max boundary - auxiliary array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];  //imp
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // calculate Right Max Boundary - auxiliary array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1]; //imp
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trappedWater = 0;
        // loop
        for (int i = 0; i < n; i++) {
            // waterLevel = min(leftMaxBound, RightMaxBound)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);   //Common mistake here: u should write leftMax[i] and rightMax[i] & not just leftMax and rightMax
            // trappedWater = waterLevel - height
            trappedWater += waterLevel - height[i]; //Common Mistake: u have to use += always.. not just = cuz we hve to add trapped rainwater
        }

        return trappedWater;

    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };

       int trappedWater =  trappedRainwaterCalc(height);
        System.out.println("Trapped Rainwater is: " + trappedWater );
    }

}