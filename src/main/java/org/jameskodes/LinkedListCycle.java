package org.jameskodes;

import org.jameskodes.helpers.ListNode;

import java.util.HashMap;

/** 141. Linked List Cycle
 * */

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {

        // See if there is a head and a next.
        if(head == null || head.next == null) { return false;}

        // Create collection for node values
        HashMap<Integer, Integer> valueHolder = new HashMap<>();
        // Add first Value
        valueHolder.put(head.val, head.val);

        while(head.next != null) { // Loop while until there is no next

            if(valueHolder.containsKey(head.next.val)) { // If next value is found in "valueHolder" means there is a cycle
                return true;
            } else { // if not found, add and continue to next
                valueHolder.put(head.val, head.val);
                head = head.next;
            }
        }
        return false;
    }
}
