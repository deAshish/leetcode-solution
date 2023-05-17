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
    public int pairSum(ListNode head) {   
        ListNode temp = head;
        List<Integer> values = new ArrayList<>();
        int result = 0;
        
        while(temp!=null){
            values.add(temp.val);
            temp = temp.next;
        }
        
        int i=0;
        int j = values.size()-1-i;
        while(i<j){
            result = Math.max(result, values.get(i)+ values.get(j));
            i++;
            j--;
        }
        return result;
    }
}