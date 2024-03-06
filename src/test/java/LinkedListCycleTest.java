import org.jameskodes.LinkedListCycle;
import org.jameskodes.helpers.ListNode;
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

        boolean asnwer = linkedListCycle.hasCycle(nodeThree);

        Assert.assertTrue("Returned wrong: " + asnwer,asnwer);
    }
}
