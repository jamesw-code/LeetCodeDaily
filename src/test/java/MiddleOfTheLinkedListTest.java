import org.jameskodes.helpers.ListNode;
import org.jameskodes.helpers.ListNodeService;
import org.junit.Before;
import org.junit.Test;

public class MiddleOfTheLinkedListTest {

    MiddleOfTheLinkedListTest middleOfTheLinkedListTest;
    ListNodeService listNodeService;

    @Before
    public void init() {
        middleOfTheLinkedListTest = new MiddleOfTheLinkedListTest();
        listNodeService = new ListNodeService();
    }

    @Test
    public void testCaseOne() {
        int[] input = {1, 2, 3, 4, 5};
        ListNode head = listNodeService.createListNode(input);
        listNodeService.printListNode(head);

    }
}
