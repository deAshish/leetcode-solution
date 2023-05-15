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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head, a=head, b=head;
        int count = 0; 
        while(temp!=null){
            count++;
            if(count == k) a = temp;
            temp= temp.next;
        }
        
        temp = head;
        for(int i=1; i<=count;i++){
            if(i== count-k+1){
                b=temp;
                break;
            }
            temp = temp.next;
        }
        
        int t =a.val;
        a.val =b.val;
        b.val=t;
            
        return head;
    }
}