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
     * @param head: a ListNode
     * @param val: An integer
     * @return: a ListNode
     */
    public ListNode removeElements(ListNode head, int val) {
        if(head !=null){
            while(head !=null && head.val == val){
                head = head.next;
            }
            ListNode listNode = new ListNode(0);
            ListNode listNodeNext = new ListNode(0);
            listNode = head;
            while(listNode != null && listNode.next !=null){
                if(listNode.next.val != val){
                    listNode = listNode.next;
                }else{
                    listNodeNext = listNode.next;
                    while(listNodeNext.next != null && listNodeNext.next.val == val){
                        listNodeNext = listNodeNext.next;
                    }
                    listNode.next = listNodeNext.next;
                }
            }
        }
        return head;
    }
}
