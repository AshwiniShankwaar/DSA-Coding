package Target100In30DaysEnd16JanLeetCode.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class PalidromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        //optimised way
        ListNode slow = head;
        ListNode fast = head;
        while(fast !=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null;
        ListNode curr = slow;
        ListNode next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        while(prev!=null){
            if(prev.val != head.val) return false;
            head = head.next;
            prev = prev.next;
        }
        return true;

//        List<Integer> list = new ArrayList<Integer>();
//        while (head != null) {
//            list.add(head.val);
//            head = head.next;
//        }
//        int i = 0;
//        int e = list.size()-1;
//        while(i<e){
//            if(!list.get(i++).equals(list.get(e--))) return false;
//        }
//        return true;
    }

    public ListNode createLinkedList(int[] arr){
        ListNode head = new ListNode();
        ListNode temp = head;
        for(int i:arr){
            ListNode child = new ListNode(i);
            temp.next = child;
            temp = temp.next;
        }
        return head.next;
    }
    public static void main(String[] args) {
        int[] arr = {1,2};
        PalidromeLinkedList p = new PalidromeLinkedList();
        ListNode head = p.createLinkedList(arr);
        if (p.isPalindrome(head)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not a palindrome");
        }


//        while(head !=null){
//            System.out.print(head.val+" ");
//            head = head.next;
//        }
    }
}
