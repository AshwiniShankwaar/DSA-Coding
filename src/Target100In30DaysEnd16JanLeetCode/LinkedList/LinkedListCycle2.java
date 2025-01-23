package Target100In30DaysEnd16JanLeetCode.LinkedList;

public class LinkedListCycle2 {
    public ListNode detectCycle(ListNode head) {
        //Optimised logic
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;

        //my logic
//        if(head == null) return null;
//        HashSet<ListNode> set = new HashSet<>();
//        ListNode temp = head;
//        while(temp.next!=null){
//            if(set.contains(temp)){
//                return temp;
//            }
//            set.add(temp);
//            temp = temp.next;
//        }
//        return null;
    }
}
