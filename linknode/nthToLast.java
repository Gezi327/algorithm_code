/**
 * Definition for ListNode.
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Solution {
    /*
     * @param head: The first node of linked list.
     * @param n: An integer
     * @return: Nth to last node of a singly linked list. 
     */
    public ListNode nthToLast(ListNode head, int n) {
        // write your code here
        ListNode probeNode = new ListNode(0);
        ListNode nthNode =  new ListNode(0);
        int i = 0;
        probeNode = head;
        for(i = 0 ;i < n; i++){
            probeNode = probeNode.next;
        }
        nthNode = head;
        while(probeNode != null){
            probeNode = probeNode.next;
            nthNode = nthNode.next;
        }
        return nthNode;
    }
}
