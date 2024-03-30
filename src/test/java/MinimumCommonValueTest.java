import org.jameskodes.MinimumCommonValue;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MinimumCommonValueTest {

    MinimumCommonValue minimumCommonValue;

    @Before
    public void init() {
        minimumCommonValue = new MinimumCommonValue();
    }

    @Test
    public void testCaseOne() {
        int answer = minimumCommonValue.getCommon( new int[]{1,2,3,4}, new int[] {2,3,4,5});

        Assert.assertEquals(2, answer);
    }

    @Test
    public void testCaseTwo() {
        int answer = minimumCommonValue.getCommon( new int[]{1,2,3,6}, new int[] {2,3,4,5});

        Assert.assertEquals(2, answer);
    }

    @Test
    public void testCaseThirtySeven() {
        int answer = minimumCommonValue.getCommon( new int[]{3,5}, new int[] {2});

        Assert.assertEquals(-1, answer);
    }

    @Test
    public void testCaseThirtyFive() {
        int answer = minimumCommonValue.getCommon( new int[]{2,4}, new int[] {1,2});

        Assert.assertEquals(2, answer);
    }
}
