import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortedArray {
    public static void main(String[] args) {
        int [] array = {1, 1, 2};
        System.out.println(removeDuplicates(array));
    }

    public static int removeDuplicates(int[] nums) {
        List<Integer> expectedNums  = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if(!expectedNums.contains(nums[i])) {
                expectedNums.add(nums[i]);
            }
        }
        nums = new int[expectedNums.size()];
        for(int i = 0; i < expectedNums.size(); i++) {
            nums[i] = expectedNums.get(i);
        }

        return expectedNums.size();
    }
}
