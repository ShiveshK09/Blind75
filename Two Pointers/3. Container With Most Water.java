//https://leetcode.com/problems/container-with-most-water/
class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1;
        int max=0;
        while(l<r){
            max=Math.max(max,Math.min(height[l],height[r])*(r-l));
            if(height[l]<height[r]) l++;
            else r--;
        }
        return max;
    }
}
/*
Two Ends → Calculate Area → Move Smaller
AREA = MIN(LEFT HEIGHT, RIGHT HEIGHT) × WIDTH
        LEFT                     RIGHT
          ↓                        ↓
      Calculate Area
          ↓
      Update MAX
          ↓
     Which is shorter?
       /          \
     LEFT        RIGHT
      ↓            ↓
    l++          r—
*/
