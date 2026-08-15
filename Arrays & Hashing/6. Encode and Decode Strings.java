//https://neetcode.io/problems/string-encode-and-decode/question
class Solution {
    public String encode(List<String> strs) {
    StringBuilder sb=new StringBuilder();
     for(String st:strs){
       sb.append(st.length());
       sb.append('`');
       sb.append(st);
     }
     return sb.toString();
    }

    public List<String> decode(String str) {
     List<String> list=new ArrayList<>();
     int i=0;
     while(i<str.length()){
      int j=i+1;
      while(str.charAt(j)!='`')j++;
      int len=Integer.parseInt(str.substring(i,j));
      list.add(str.substring(j+1,len+j+1));
      i=len+j+1;
     }
     return list;
    }
}
/*
        ENCODE
          ↓
   LENGTH + DELIMITER + STRING
          ↓
        DECODE
          ↓
 FIND → LENGTH → READ → MOVE
*/
