//https://leetcode.com/problems/valid-parentheses/
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='(' || c=='{' || c=='[') st.push(c);
            else {
                if(st.isEmpty()) return false;
                char top=st.pop();
                if(c==')' && top!='(' || c=='}' && top!='{' || c==']' && top!='[') return false;
            }
        }
        return st.isEmpty();
    }
}
/*
OPEN (‘{’)→ PUSH, CLOSE (‘}’)→ MATCH → POP
Read Character
      ↓
Is it OPEN?
   /       \
 YES        NO
  ↓          ↓
PUSH       Stack Empty?
             /    \
           YES     NO
            ↓       ↓
          FALSE    POP
                     ↓
                  MATCH?
                 /      \
               YES       NO
                ↓         ↓
             Continue    FALSE
Stack Empty?
   ↓
YES → Valid
NO  → Invalid
*/
