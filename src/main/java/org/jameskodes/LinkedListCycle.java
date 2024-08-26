package org.jameskodes;

import org.jameskodes.datastructures.ListNode;

import java.util.HashMap;

/** 141. Linked List Cycle
 * */

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {

        ListNode slow = head, fast =head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) {
                return true;
            }
        }
        return false;
    }

    // My attempt at solution failed on Leet Code passed on my machine ...
    public boolean hasCycleOne(ListNode head) {

        // See if there is a head and a next.`
        if(head == null || head.next == null) { return false;}

        // Create collection for node values
        HashMap<Integer, Integer> valueHolder = new HashMap<>();
        // Add first Value
        valueHolder.put(head.val, head.next.val);

        while(head.next != null) { // Loop while until there is no next

            if(valueHolder.containsKey(head.next.val)) {
                // If next value is found in "valueHolder" means there is a cycle
                // Now check if current next values are the same
                if(valueHolder.get(head.next.val) == head.next.val) {
                    // if values are equal, proper loop
                    return true;
                } else {
                    // else duplicate heads
                    return false;
                }
            } else { // if not found, add and continue to next
                valueHolder.put(head.val, head.next.val);
                head = head.next;
            }
        }
        return false;
    }
}
