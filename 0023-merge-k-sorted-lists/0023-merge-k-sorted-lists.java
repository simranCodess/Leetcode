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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0||lists==null){
            return null;
        }
        int size=lists.length;
        while(size>1){
            for(int i=0; i<size/2; i++){
                lists[i]=mergeTwoLists(lists[i],lists[size-i-1]);
            }
            size=(size+1)/2;
        }
        return lists[0];
    }

    public ListNode mergeTwoLists(ListNode one, ListNode two){
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;

        while(one!=null&&two!=null){
            if(one.val<=two.val){
                temp.next=new ListNode(one.val,null);
                one=one.next;
            }
            else{
                temp.next=new ListNode(two.val,null);
                two=two.next;
            }
            temp=temp.next;
        }

        if(one!=null){
            temp.next=one;
        }
        if(two!=null){
            temp.next=two;
        }

        return dummy.next;

    }
}