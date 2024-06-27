import org.jameskodes.MaximumNumberOfVowels;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaximumNumberOfVowelsTest {

    MaximumNumberOfVowels maximumNumberOfVowels;
    String s;
    int k;
    int expectedAnswer;

    @Before
    public void init() {
        maximumNumberOfVowels = new MaximumNumberOfVowels();
        s = null;
        k = 0;
        expectedAnswer = 0;
    }

    @Test
    public void test1() {
        s = "abciiidef";
        k = 3;
        int answer = maximumNumberOfVowels.maxVowels(s, k);

        expectedAnswer = 3;

        Assert.assertEquals("Wrong Answer", 3,answer);
    }
}
