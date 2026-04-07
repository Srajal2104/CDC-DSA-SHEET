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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode p=head;
        while(p.next!=null){
            ListNode q=new ListNode(gcd(p.val,p.next.val),p.next);
            p.next=q;
            p=q.next;
        }
        return head;
    }
    public int gcd(int a,int b){
        if(b==0)   return a;
        return gcd(b,a%b);
    }
}