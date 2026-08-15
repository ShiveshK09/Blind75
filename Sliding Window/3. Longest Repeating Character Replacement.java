//https://leetcode.com/problems/longest-repeating-character-replacement/
class Solution {
    public int characterReplacement(String s, int k) {
        int[] cnt=new int[128];
        int l=0,ans=0,max=0;
        for(int r=0;r<s.length();r++){
            max=Math.max(max,++cnt[s.charAt(r)-'A']);
            while((r-l+1)-max>k) max=Math.max(max,cnt[s.charAt(l++)-'A']--);
            ans=Math.max(r-l+1,ans);
        }
        return ans;
    }
}
/*
Sliding Window → Most Frequent → Replacements Needed
Window Size − Most Frequent Character = Characters We Need to Replace
COUNT → MAX → CHECK → SHRINK → ANSWER
COUNT characters
       ↓
Find MAX frequency
       ↓
Window(r-l+1) - MAX > K ?
       ↓
YES → SHRINK LEFT
       ↓
NO → UPDATE ANSWER

*/
