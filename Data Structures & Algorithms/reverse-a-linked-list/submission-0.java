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
        ListNode temp = head;
        Stack<Integer> st = new Stack<>();
        while(temp != null){
            st.push(temp.val);
            temp = temp.next;
        }
        ListNode newList = null;
        ListNode current = null;
        while(!st.empty()){
            ListNode node = new ListNode(st.pop());
            if(newList == null){
                newList = node;
                current = node;
            }else{
                current.next = node;
                current = current.next;
            }
        }
        return newList;
    }
}
