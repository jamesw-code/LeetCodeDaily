import org.jameskodes.SortArrayByIncreasingFrequency;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class SortArrayByIncreasingFrequencyTest {

    SortArrayByIncreasingFrequency sortArrayByIncreasingFrequency;

    @Before
    public void init() {
        sortArrayByIncreasingFrequency = new SortArrayByIncreasingFrequency();
    }

    @Test
    public void testCaseCustom() {
        int[] nums = new int[] {1,2,3,4,5,5,5};

        int[] answer = sortArrayByIncreasingFrequency.frequencySort(nums);

        System.out.println(Arrays.toString(answer));
    }

    @Test
    public void testCaseOne() {
        int[] nums = new int[] {1,1,2,2,2,3};

        int[] answer = sortArrayByIncreasingFrequency.frequencySort(nums);

        System.out.println(Arrays.toString(answer));
    }

    @Test
    public void testCaseThree() {
        int[] nums = new int[] {-1,1,-6,4,5,-6,1,4,1};

        int[] answer = sortArrayByIncreasingFrequency.frequencySort(nums);

        System.out.println(Arrays.toString(answer));
    }
}
