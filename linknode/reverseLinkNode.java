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
     * @param head: n 
     * @return: The new head of reversed linked list. 
     */  
    public ListNode reverse(ListNode head) {  
              
        if(head != null && head.next != null){  
            ListNode secondNode = new ListNode(0);  
            ListNode thirdNode = new ListNode(0);  
            secondNode = head.next;  
            thirdNode = secondNode.next;  
              
            head.next = null;  
            while(thirdNode != null){  
                secondNode.next = head;  
                head = secondNode;  
                secondNode = thirdNode;  
                thirdNode = secondNode.next;  
            }
  
            secondNode.next = head;  
            head = secondNode;  
        }  
        return head;  
    }  
}  