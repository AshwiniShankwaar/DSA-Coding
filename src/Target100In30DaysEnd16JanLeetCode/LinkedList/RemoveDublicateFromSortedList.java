package Target100In30DaysEnd16JanLeetCode.LinkedList;
/**
 * Given the head of a sorted linked list, delete all duplicates such that each element
 * appears only once. Return the linked list sorted as well.
 * */
public class RemoveDublicateFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while (temp.next != null) {
            if(temp.next.val==temp.val){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        RemoveDublicateFromSortedList r = new RemoveDublicateFromSortedList();
        r.deleteDuplicates(head);
    }
}

//  public class ListNode {
//      int val;
//      ListNode next;
//      ListNode() {}
//      ListNode(int val) { this.val = val; }
//      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }

