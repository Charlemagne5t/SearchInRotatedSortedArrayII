import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void searchTest1() {
        int[] nums = {2, 5, 6, 0, 0, 1, 2};
        int target = 0;
        Assert.assertTrue(new Solution().search(nums, target));
    }

    @Test
    public void searchTest2() {
        int[] nums = {2, 5, 6, 0, 0, 1, 2};
        int target = 3;
        Assert.assertFalse(new Solution().search(nums, target));
    }
}
