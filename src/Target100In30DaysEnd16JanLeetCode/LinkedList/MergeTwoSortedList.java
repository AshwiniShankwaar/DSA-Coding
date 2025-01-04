package Target100In30DaysEnd16JanLeetCode.LinkedList;

import java.util.List;

/**
 * You are given the heads of two sorted linked lists list1 and list2.
 *
 * Merge the two lists into one sorted list. The list should be made by splicing together
 * the nodes of the first two lists.
 *
 * Return the head of the merged linked list.
 * */
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class MergeTwoSortedList {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode temp = head;
        temp.val = 0;
        while (list1!=null && list2!=null){
            ListNode cur = new ListNode();
            cur.next = null;
            if(list1.val<=list2.val){
                cur.val = list1.val;
                list1 = list1.next;
            }else{
                cur.val = list2.val;
                list2 = list2.next;
            }
            temp.next = cur;
            temp = cur;
        }
        while(list1!=null){
            ListNode cur = new ListNode();
            cur.next = null;
            cur.val = list1.val;
            list1 = list1.next;
            temp.next = cur;
            temp = cur;
        }
        while(list2!=null){
            ListNode cur = new ListNode();
            cur.next = null;
            cur.val = list2.val;
            list2 = list2.next;
            temp.next = cur;
            temp = cur;
        }
        return head.next;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode result = mergeTwoLists(list1,list2);
        while(result!=null){
            System.out.println(result.val);
            result = result.next;
        }
    }
}
