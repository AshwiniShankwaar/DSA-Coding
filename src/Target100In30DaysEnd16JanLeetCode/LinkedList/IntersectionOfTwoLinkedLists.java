package Target100In30DaysEnd16JanLeetCode.LinkedList;

public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = len(headA);
        int lenB = len(headB);

        if(lenA > lenB){
            headA = moveHead(headA, lenA - lenB);
        }
        else if(lenA < lenB){
            headB = moveHead(headB, lenB - lenA);
        }
        return compare(headA, headB);
    }

    private int len(ListNode node){
        if(node == null) return 0;
        else return 1 + len(node.next);
    }

    private ListNode moveHead(ListNode node, int count){
        for(int i = 0; i < count; i++){
            node = node.next;
        }return node;
    }

    private ListNode compare(ListNode nodeA, ListNode nodeB){
        if(nodeA==null || nodeB==null) return null;
        if(nodeA==nodeB) return nodeA;
        return compare(nodeA.next, nodeB.next);
    }

//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //brutal force approach
//        ListNode tempA = headA;
//
//        while(tempA!=null){
//            ListNode tempB = headB;
//            while(tempB!=null){
//                if(tempA == tempB)
//                    return tempA;
//                tempB = tempB.next;
//            }
//            tempA = tempA.next;
//        }
//        return null;
//    }

}
