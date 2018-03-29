/**
 * Definition for ListNode
*/
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
 

public class Solution {
    /**
     * @param head: the first node of linked list.
     * @return: An integer
     */
    public int countNodes(ListNode head) {
        int i = 0;
        while(head != null){
            i++;
            head = head.next;
        }
        return i;
    }
}
