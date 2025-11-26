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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null)  return head;
        ListNode ptr=head;
        int c=0;
        while(ptr!=null){
            ptr=ptr.next;
            c++;
        }   
        int rotate=k%c;
        for(int i=0;i<rotate;i++){
            ListNode last=head,prev=null;
            while(last.next!=null){
                prev=last;
                last=last.next;
            }
            last.next=head;
            prev.next=null;
            head=last;
        }
        return head;
    }
}