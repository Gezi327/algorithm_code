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
  
public class AddListNode {  
    /** 
     * @param l1: the first list 
     * @param l2: the second list 
     * @return: the sum list of l1 and l2  
     */  
    public ListNode addLists(ListNode l1, ListNode l2) {  
        ListNode listNode = new ListNode(0);  
        ListNode p = new ListNode(0);  
        p = listNode;  
        int sum = 0;  
        while(l1 != null || l2!= null || sum!=0){  
            if (l1 != null){  
                sum = sum + l1.val;  
                l1 = l1.next;  
            }  
            if(l2 != null){  
                sum = sum + l2.val;  
                l2 = l2.next;  
            }  
            p.next = new ListNode(sum%10);  
            p = p.next;  
            sum = sum/10;  
        }  
        return listNode.next;  
    }  
}  