package Target100In30DaysEnd16JanLeetCode.LinkedList;

public class RemovedLinkedListElement {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;

//        if(head.val == val) head = head.next;
//        ListNode temp = head;
//        while(temp!=null){
//            if(temp.next.val == val){
//                temp.next = temp.next.next;
//            }else{
//                temp = temp.next;
//            }
//        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{7,7,7,7,7};
        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;
        for(int i=1; i< arr.length; i++) {
            ListNode node = new ListNode(arr[i]);
            temp.next = node;
            temp = temp.next;
        }
//        ListNode head = new ListNode(6,
//                new ListNode(2,
//                        new ListNode(6,
//                                new ListNode(6,
//                                        new ListNode(4,
//                                                new ListNode(6,
//                                                        new ListNode(5,
//                                                                new ListNode(6))))))));
        head = new RemovedLinkedListElement().removeElements(head,7);
        while (head!=null){
            System.out.println(head.val);
            head = head.next;
        }
    }
}
