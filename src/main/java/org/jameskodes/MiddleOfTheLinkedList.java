package org.jameskodes;

import org.jameskodes.helpers.ListNode;

/**
 * Leet Code Daily Challenge 03062024
 * 876. Middle of the Linked List
 */
public class MiddleOfTheLinkedList {

    public ListNode middleNode(ListNode head) {

        int length = 0;
        ListNode counter = head;

        while(counter != null ){
            length++;
            counter = counter.next;
        }

        int midPoint = length/2;
        int moveUpTo = 1;
        while(moveUpTo <= midPoint) {
            head = head.next;
            moveUpTo++;

        }
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while(head != null) {
            current.next = head;
            current = current.next;
            head = head.next;
        }

        return dummy.next;
    }
}
