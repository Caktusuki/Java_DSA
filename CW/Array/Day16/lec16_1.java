// 25th February 2026
package CW.Array.Day16;

public class lec16_1 {
    public static void trappingRainWater(int[] height) {
        int n = height.length;
        int leftMax=0, rightMax=0, maxHeight=height[0], index=0, water=0;
        // Max height building
        for(int i=1; i<n; i++){
            if(maxHeight < height[i]){
                maxHeight = height[i];
                index = i;
            }
        }
        // Left of max height building
        for(int i=0; i<index; i++){
            if(height[i] > leftMax){
                leftMax = height[i];
            } else {
                water = water + (leftMax - height[i]);
            }
        }
        // Right of max height building
        for(int i=n-1; i>index; i--){
            if(height[i] > rightMax){
                rightMax = height[i];
            } else {
                water = water + (rightMax - height[i]);
            }
        }
        System.out.println(water);
    }

    public static void main(String[] args) {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        trappingRainWater(height);
    }
}
