// 42. Trapping Rain Water
package Leetcode.Hard;
public class Leet_42 {

    public int trap(int[] height){
        int n = height.length;
        int leftMax=0, rightMax=0, maxHeight=height[0], index=0, water=0;
        // Max height building
        for(int i=1; i<n; i++){
            if(maxHeight < height[i]){
                maxHeight = height[i];
                index = i;
            }
        }
        // Left part
        for(int i=0; i<index; i++){
            if(leftMax>height[i]){
                water += leftMax - height[i];
            } else {
                leftMax = height[i];
            }
        }
        // Right part
        for (int i = n-1; i > index; i--) {
            if (rightMax > height[i]) {
                water += rightMax - height[i];
            } else {
                rightMax = height[i];
            }
        }
        return water;
    }

    public static void main(String[] args) {
        Leet_42 solution = new Leet_42();
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int trappedWater = solution.trap(height);
        System.out.println("Trapped Water: " + trappedWater);
    }
}
