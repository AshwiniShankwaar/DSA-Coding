package Target100In30DaysEnd16JanLeetCode.LinkedList;

public class RemovedLinkedListElement {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
//        ListNode dummy = new ListNode();
//        ListNode dummyTemp = dummy;
//        ListNode temp = head;
//        while(temp!=null){
//            ListNode node = new ListNode(temp.val);
//            if(temp.val != val) {
//                dummyTemp.next = node;
//                dummyTemp = dummyTemp.next;
//            }
//            temp = temp.next;
//        }
//        return dummy.next;

        //optimised way using recursion
        if(head == null) return null;
        head.next = removeElements(head.next,val);
        if(head.val == val){
            return head.next;
        }else{
            return head;
        }

    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,6,4,6,5};
        int val = 6;
        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;
        for(int i=1; i< arr.length; i++) {
            ListNode node = new ListNode(arr[i]);
            temp.next = node;
            temp = temp.next;
        }
//        System.out.println(head.val);
//        ListNode head = new ListNode(6,
//                new ListNode(2,
//                        new ListNode(6,
//                                new ListNode(6,
//                                        new ListNode(4,
//                                                new ListNode(6,
//                                                        new ListNode(5,
//                                                                new ListNode(6))))))));
        head = new RemovedLinkedListElement().removeElements(head,val);
        while (head!=null){
            System.out.println(head.val);
            head = head.next;
        }
    }
}
