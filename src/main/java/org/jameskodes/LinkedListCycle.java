package org.jameskodes;

import org.jameskodes.helpers.ListNode;

import java.util.HashMap;

/** 141. Linked List Cycle
 * */

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {

        // See if there is a next.
        if(head.next == null) { return false;}

        HashMap<Integer, Integer> valueHolder = new HashMap<>();
        valueHolder.put(head.val, head.val);


        while(head.next != null) {

            if(valueHolder.containsKey(head.next.val)) {
                // Existing Node Found
                return true;
            } else {
                valueHolder.put(head.val, head.val);
                head = head.next;
            }
        }
        return false;
    }
}
