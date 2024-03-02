package Prepration.Search;

import java.util.Scanner;

class Node{
    int item = 0;
    Node next = null;
}
public class Search_linkedlist_inside_linkedlist {
    static Scanner scanner;
    public static void main(String[] args){
        scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        Node head1 = createList(size);
        int size2 = scanner.nextInt();
        Node head2 = createList(size2);

//        Node temp = head1;
//        while(temp != null){
//            System.out.print(temp.item+"->");
//            temp = temp.next;
//        }
        boolean is_present = ispresent(head1, head2);
        System.out.println(is_present?"Present":"Not Present");
    }

    private static boolean ispresent(Node head2, Node head1) {
        Node temp1 = head1;
        while (temp1 != null){
            if (temp1.item == head2.item){
                temp1 = temp1.next;
                head2 = head2.next;
                if (head2 == null){
                    return true;
                }
            }else{
                temp1 = head1;
                head2 = head2.next;
            }
        }
        return false;
    }

    private static Node createList(int size) {
        Node headNode = new Node();
        headNode.item = scanner.nextInt();
        int i = 0;
        Node temp = headNode;
        while (i < (size-1)) {
            i++;
            Node child = new Node();
            child.item = scanner.nextInt();
            temp.next = child;
            temp = temp.next;
        }
        return headNode;
    }
}
