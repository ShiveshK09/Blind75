//https://leetcode.com/problems/contains-duplicate/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int n:nums) if(!set.add(n)) return true;
   return false;
    }
}

/*
Check → Add
         Number n
             ↓
      Is n already in Set?
        /             \
      YES              NO
       ↓                ↓
   Duplicate         Add to Set
    return true          ↓
                       Continue
*/
