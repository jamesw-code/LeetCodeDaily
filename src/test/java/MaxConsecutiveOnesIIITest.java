import org.jameskodes.MaxConsecutiveOnesIII;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaxConsecutiveOnesIIITest {

    MaxConsecutiveOnesIII maxConsecutiveOnesIII;

    @Before
    public void init() {
        maxConsecutiveOnesIII = new MaxConsecutiveOnesIII();
    }

    @Test
    public void test1() {
        int[] nums = new int[] {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        int expectedAnswer = 6;

        int answer = maxConsecutiveOnesIII.longestOnes(nums, k);

        Assert.assertEquals("Wrong Answer", expectedAnswer, answer);
    }

    @Test
    public void test49() {
        int[] nums = new int[] {0,0,0,1};
        int k = 4;
        int expectedAnswer = 4;

        int answer = maxConsecutiveOnesIII.longestOnes(nums, k);

        Assert.assertEquals("Wrong Answer", expectedAnswer, answer);
    }
}
