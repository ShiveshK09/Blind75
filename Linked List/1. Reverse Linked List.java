//https://leetcode.com/problems/reverse-linked-list/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null) return null;
        ListNode cur=head;
        ListNode pre=null;
        while(cur!=null){
            ListNode tmp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=tmp;
        }
        return pre;
    }
}
/*
3 POINTERS
PRE = null
CUR = head

while CUR:
    NEXT = CUR.next
    CUR.next = PRE
    PRE = CUR
    CUR = NEXT

return PRE
*/
