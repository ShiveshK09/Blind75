//https://leetcode.com/problems/group-anagrams/
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        Map<String,List<String>> map=new HashMap<>();
        
        for(String st:strs){
            //char[] ch=st.toCharArray();
            char[] ch=new char[26];
            for(char c:st.toCharArray()){
                ch[c-'a']++;
            }
            String s=new String(ch);
            if(!map.containsKey(s)) map.put(s,new ArrayList<>());
            map.get(s).add(st);          
        }
        for(String key:map.keySet()){
            ans.add(map.get(key));
        }
        return ans;
    }
}
/*
SIGNATURE → HASHMAP → GROUP
Each String
    ↓
COUNT 26 Characters
    ↓
Create Signature
    ↓
Signature = HashMap KEY
    ↓
Original String = HashMap VALUE
    ↓
Same Signature?
   /       \
 YES        NO
  ↓          ↓
Same Group  New Group
"COUNT → SIGNATURE → MAP → ADD"
COUNT letters
     ↓
CREATE signature
     ↓
USE signature as KEY
     ↓
ADD original word
Repeat for every string.
At the end:
MAP VALUES = ANSWER
*/
