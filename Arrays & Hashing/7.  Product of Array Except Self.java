//https://leetcode.com/problems/product-of-array-except-self/
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        ans[0]=1;
        for(int i=1;i<n;i++) ans[i]=ans[i-1]*nums[i-1];
        int suffix=1;
        for(int i=n-1;i>=0;i--){
        ans[i]*=suffix;
        suffix*=nums[i];
        }
        return ans;
    }
}
/*
Prefix First → Suffix Second → Multiply
First store everything LEFT, then multiply everything RIGHT
              PRODUCT EXCEPT SELF
                       ↓
          LEFT PRODUCT × RIGHT PRODUCT
                 ↓             ↓
           Prefix Pass     Suffix Pass
             L → R           R → L
                 ↓             ↓
                ans     ×    suffix
*/
