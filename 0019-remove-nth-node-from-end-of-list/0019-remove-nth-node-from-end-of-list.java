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
        //finding list size
        int size=0;
        ListNode first=head;
        while(first!=null){
            first=first.next;
            size++;
        }
        if(size==1){
            return null;
        }
        first=head;
        int toDeletePos=size-n;
        if(toDeletePos==0){
            return head.next;
        }
        for(int i=0; i<toDeletePos-1; i++){
            first=first.next;
        }
        first.next=first.next.next;
        return head;
    }
}