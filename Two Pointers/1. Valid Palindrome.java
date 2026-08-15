//https://leetcode.com/problems/valid-palindrome/
class Solution {
    public boolean isPalindrome(String s) {
        int l=0,r=s.length()-1;
        while(l<r){
            while(l<r && !Character.isLetterOrDigit(s.charAt(l))) l++;
            while(l<r && !Character.isLetterOrDigit(s.charAt(r))) r--;
            if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r))) return false;
            l++;
            r--;
        }
        return true;
    }
}
/*
TWO POINTERS → SKIP(!Character.isLetterOrDigit()) → COMPARE (Character.toLowerCase())→ MOVE
      LEFT              RIGHT
        ↓                 ↓
   Skip non-valid    Skip non-valid
        ↓                 ↓
        └──── COMPARE ────┘
                 ↓
            Different?
           /          \
         YES           NO
          ↓             ↓
       FALSE        Move inward
                        ↓
                     Repeat
*/
