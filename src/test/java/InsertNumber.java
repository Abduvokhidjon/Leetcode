public class InsertNumber {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 6};
        int target = 4;
        System.out.println(searchInsert(array, target));


    }

    public static int searchInsert(int[] nums, int target) {
        int leftIndex = 0;
        int rightIndex = nums.length - 1;

        while (leftIndex <= rightIndex) {
            int midIndex = (leftIndex + rightIndex) / 2;

            if (nums[midIndex] == target) {
                return midIndex;
            } else if (nums[midIndex] < target) {
                leftIndex = midIndex+1;
            } else {
                rightIndex = midIndex;
            }

            if (nums[midIndex] < target && target < nums[rightIndex]) {
                return rightIndex;
            } else if (nums[midIndex] > target && target > nums[leftIndex]) {
                return midIndex;
            }

        }

        return -1;
    }
}
