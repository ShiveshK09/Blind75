//https://leetcode.com/problems/valid-anagram/
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] cnt=new int[26];
        for(int i=0;i<s.length();i++){
            cnt[s.charAt(i)-'a']++;
            cnt[t.charAt(i)-'a']--;
        }
        for(int c:cnt)if(c!=0)return false;
        return true;
    }
}
/*
Same Length → Count + → Count − → Check Zero
        Same Length?
          /     \
        NO       YES
        ↓         ↓
      false    COUNT
                  ↓
        s → +1   t → -1
                  ↓
            Check all ZERO
             /          \
           YES           NO
            ↓             ↓
          true          false
*/
