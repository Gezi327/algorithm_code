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
     * @param head: head is the head of the linked list
     * @return: head of linked list
     */
    public ListNode deleteDuplicates(ListNode head) {
        ListNode listNodeHead = new ListNode(0);
        listNodeHead.next = head;
        ListNode probeNode = new ListNode(0);
       
        while(head != null){
            probeNode = head.next;
            while(probeNode !=null && probeNode.val == head.val){
                probeNode = probeNode.next;
                head.next = probeNode;
            }
            head = head.next;
        }
        return listNodeHead.next;
    }
}
