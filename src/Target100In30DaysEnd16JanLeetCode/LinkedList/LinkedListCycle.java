package Target100In30DaysEnd16JanLeetCode.LinkedList;


/**
 *Given head, the head of a linked list, determine if the linked list has a cycle in it.
 *
 * There is a cycle in a linked list if there is some node in the list that can be reached again by
 * continuously following the next pointer. Internally, pos is used to denote the index of the node that
 * tail's next pointer is connected to. Note that pos is not passed as a parameter.
 *
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 * */



public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        //optimised way
        ListNode slow = head;
        ListNode fast = head;
        // we will move slow and fast node slow by 1 nad fast can be by 2, 3,4 ..and if slow == fast we will return true means loop exist in the list
        while (fast!= null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next;
            if (slow == fast ){
                return true;
            }
        }
        return false;
        //my way
//        if(head == null) return false;
//        HashSet<ListNode> set = new HashSet<>();
//        ListNode temp = head;
//        while(temp.next!=null){
//            if(set.contains(temp)){
//                return true;
//            }
//            set.add(temp);
//            temp = temp.next;
//        }
//        return false;
    }
}
