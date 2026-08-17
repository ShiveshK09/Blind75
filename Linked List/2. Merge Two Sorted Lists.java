//https://leetcode.com/problems/merge-two-sorted-lists/
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans=new ListNode(-1);
        ListNode cur=ans;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                cur.next=list1;
                cur=cur.next;
                list1=list1.next;
            }
            else {
                cur.next=list2;
                cur=cur.next;
                list2=list2.next;
            }
        }
        if(list1==null)cur.next=list2;
        if(list2==null) cur.next=list1;
        return ans.next;
    }
}
/*
Dummy
  ↓
while both exist
  ↓
compare
  ↓
attach smaller
  ↓
move selected pointer + cur
  ↓
attach leftover
  ↓
return dummy.next
*/
