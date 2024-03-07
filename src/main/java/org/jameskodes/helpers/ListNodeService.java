package org.jameskodes.helpers;

public class ListNodeService {

    public ListNode createListNode(int[] input) {
        if (input == null || input.length == 0)
            return null;

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (int num : input) {
            current.next = new ListNode(num);
            current = current.next;
        }

        return dummy.next;
    }

    public void printListNode(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }


}
