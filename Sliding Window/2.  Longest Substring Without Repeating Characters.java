//https://leetcode.com/problems/longest-substring-without-repeating-characters/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,ans=0;
        Map<Character,Integer> map=new HashMap<>();
        for(int r=0;r<s.length();r++){
          char c=s.charAt(r);
          if(map.containsKey(c)) l=Math.max(l,map.get(c)+1);
          map.put(c,r);
          ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}
/*
Sliding Window + Last Seen Index
CHECK → JUMP → UPDATE → MAX
CHECK  → Is character already seen?
JUMP   → Move l after previous occurrence
UPDATE → Store current index
MAX    → Update longest window
              RIGHT++
                  ↓
             Read Character
                  ↓
         Is Character in Map?
            /           \
          NO             YES
           ↓              ↓
       Continue      Move L to
                    oldIndex + 1
            \          /
             ↓        ↓
           Update Map
               ↓
         Calculate Window(r-l+1)
               ↓
           Update MAX
*/
