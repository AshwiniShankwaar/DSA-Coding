package Target100In30DaysEnd16JanLeetCode.LinkedList;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode dummy =  null;
        ListNode temp = head;
        while(temp!=null){
            ListNode node = new ListNode(temp.val);
            if(dummy == null){
                dummy = node;
            }else{
                node.next = dummy;
                dummy = node;
            }
            temp = temp.next;
        }
        return dummy;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
        head = new ReverseLinkedList().reverseList(head);
        while(head!=null){
            System.out.println(head.val);
            head = head.next;
        }
    }
}
