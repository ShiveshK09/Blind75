//https://leetcode.com/problems/two-sum/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int val=target-nums[i];
            if(map.containsKey(val)) return new int[]{i,map.get(val)};
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
/*
Find what I NEED → CHECK if I saw it → STORE what I have.
HashMap
   ↓
target - current
   ↓
Check map
   ↓
Found → Answer
   ↓
Not found → Store
*/
