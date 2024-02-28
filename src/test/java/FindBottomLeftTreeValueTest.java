import org.jameskodes.FindBottomLeftTreeValue;
import org.jameskodes.helpers.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FindBottomLeftTreeValueTest {

    FindBottomLeftTreeValue findBottomLeftTreeValue;
    TreeNode root;

    @BeforeEach
    public void init(){
        findBottomLeftTreeValue = new FindBottomLeftTreeValue();
    }

    @Test
    void firstTest(){
        TreeNode oneValue = new TreeNode(1);
        TreeNode threeValue = new TreeNode(3);
        TreeNode testTree = new TreeNode(2, oneValue, threeValue);

        int answer = findBottomLeftTreeValue.solution(testTree);

        Assertions.assertEquals(1, answer);
    }

    @Test
    void secondTest(){
        TreeNode sevenValue = new TreeNode(1, null, null);
        TreeNode fiveValue = new TreeNode(5, sevenValue, null);
        TreeNode sixValue = new TreeNode(6, null, null);
        TreeNode threeValue = new TreeNode(3, fiveValue, sixValue);

        TreeNode twoValue = new TreeNode(2, new TreeNode(4), null);
        TreeNode oneValue = new TreeNode(1, twoValue, threeValue);


        int answer = findBottomLeftTreeValue.solution(oneValue);

        Assertions.assertEquals(7, answer);
    }



}
