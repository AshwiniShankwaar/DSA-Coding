package Target100In30DaysEnd16JanLeetCode.LinkedList;

public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return null;


        ListNode even = new ListNode();
        ListNode evenTemp = even;
        ListNode temp = head;
        while(temp!=null && temp.next!=null){
            evenTemp.next = temp.next;
            temp.next = temp.next.next;
            temp = temp.next;
            evenTemp = evenTemp.next;
        }
        evenTemp.next = null;
        temp = head;
        while (temp.next !=null){
            temp = temp.next;
        }
        temp.next = even.next;
        return head;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
 //       ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,new ListNode(6,new ListNode(7,new ListNode(8))))))));
//ListNode head = new ListNode(2,new ListNode(1,new ListNode(3,new ListNode(5,new ListNode(6,new ListNode(4,new ListNode(7)))))));
        head = new OddEvenLinkedList().oddEvenList(head);
        while(head!=null){
            System.out.println(head.val);
            head = head.next;
        }
    }
}
