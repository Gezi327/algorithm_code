**  
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
     * @param head: The first node of linked list. 
     * @param n: An integer 
     * @return: The head of linked list. 
     */  
    public ListNode removeNthFromEnd(ListNode head, int n) {  
        ListNode probeNode = new ListNode(0);  
        ListNode currentNode = new ListNode(0);  
        ListNode headNode = new ListNode(0);  
        probeNode.next = head;  
        int i;  
        if(probeNode.next != null){  
            for(i = 0; i <= n; i++){  
            probeNode = probeNode.next;  
            }  
            currentNode.next = head;  
            headNode = currentNode;  
            while(probeNode != null){  
                probeNode = probeNode.next;  
                currentNode = currentNode.next;  
            }  
            currentNode.next = currentNode.next.next;  
        }else{  
            headNode.next = null;  
        }  
          
        return headNode.next;  
    }  
}  