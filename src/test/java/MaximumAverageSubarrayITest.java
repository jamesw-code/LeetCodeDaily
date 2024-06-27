import org.jameskodes.MaximumAverageSubarrayI;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaximumAverageSubarrayITest {

    MaximumAverageSubarrayI maximumAverageSubarrayI;

    @Before
    public void init() {maximumAverageSubarrayI = new MaximumAverageSubarrayI();}

    @Test
    public void testOne() {
        int[] nums = new int[] {1,12,-5,-6,50,3};
        int k = 4;
        double answer = maximumAverageSubarrayI.findMaxAverage(nums, k);

        Assert.assertEquals("Not Correct", 12.75000, answer, 0.0);
    }

    @Test
    public void test118() {
        int[] nums = new int[] {-1};
        int k = 1;
        double expectedAnswer = -1.00000;
        double answer = maximumAverageSubarrayI.findMaxAverage(nums, k);

        Assert.assertEquals("Not Correct", expectedAnswer, answer, 0.0);
    }

}
