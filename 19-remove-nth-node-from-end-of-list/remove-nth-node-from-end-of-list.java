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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int l=0;
        ListNode curr=head;
        while(curr!=null){
            l++;
            curr=curr.next;
        }
        int k=l-n;
        ListNode temp=head;
        if(k==0){
            return head.next;
        }
        for(int i=0;i<k-1;i++){
          temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}