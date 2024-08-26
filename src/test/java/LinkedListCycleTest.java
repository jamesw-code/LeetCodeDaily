import org.jameskodes.LinkedListCycle;
import org.jameskodes.datastructures.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinkedListCycleTest {

    LinkedListCycle linkedListCycle;

    @Before
    public void init() {
        linkedListCycle = new LinkedListCycle();
    }

    @Test
    //        Input: head = [3,2,0,-4], pos = 1
    //        Output: true
    //        Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
    public void testOne() {
        ListNode nodeThree = new ListNode(3);
        ListNode nodeTwo = new ListNode(2);
        ListNode nodeZero = new ListNode(0);
        ListNode nodeNegFour = new ListNode(-4);

        nodeThree.next = nodeTwo;
        nodeTwo.next = nodeZero;
        nodeZero.next = nodeNegFour;
        nodeNegFour.next = nodeTwo;

        boolean answer = linkedListCycle.hasCycle(nodeThree);

        Assert.assertTrue("Returned wrong: " + answer,answer);
    }

    @Test
    //        Input: head = [],
    //        Output: false
    //        Explanation: its empty
    public void testThree() {
        boolean answer = linkedListCycle.hasCycle(null);
        Assert.assertFalse("Returned wrong: " + answer,answer);
    }

    @Test
    // Input: head = [-21,10,17,8,4,26,5,35,33,-7,-16,27,-12,6,29,-12,5,9,20,14,14,2,13,-24,21,23,-21,5]
    //        Output: false
    //        Explanation: -21 does not loop properly
    // Test case will not work becua
    public void testTwentyTwo() {
        ListNode nodeThree = new ListNode(3);
        ListNode nodeTwo = new ListNode(2);
        ListNode nodeThreeFake = new ListNode(3);
        ListNode nodeNegFour = new ListNode(-4);


        nodeTwo.next = nodeThreeFake;
        nodeThreeFake.next = nodeNegFour;
        nodeNegFour.next = null;
        nodeThree.next = nodeTwo;

        boolean answer = linkedListCycle.hasCycle(nodeThree);

        Assert.assertFalse("Returned wrong: " + answer,answer);

    }
}
