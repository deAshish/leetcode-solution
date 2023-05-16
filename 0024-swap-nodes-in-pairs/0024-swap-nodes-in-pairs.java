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
    public ListNode swapPairs(ListNode head) {
        ListNode temp = head, a = head, b = head;
        int c = 0;
        
        while(temp!=null){
            c++;
            if(c % 2 == 0){
                b = temp;
                int x = a.val;
                a.val = b.val;
                b.val = x;
            }
            else if(c % 2 !=0){
                a = temp;
            }
            temp = temp.next;
            
        }
           
        return head;
    }
}