import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] ar1 = new int[8];
        ar1[0] = 5;
        ar1[1] = 7;
        ar1[2] = 8;
        ar1[3] = 0;
        ar1[4] = 0;
        ar1[5] = 0;
        ar1[6] = 0;
        ar1[7] = 0;
        int[] ar2 = {1, 2, 3};
        int m = 3;

        int n = ar2.length;
        System.out.println(m + " " + n);
        System.out.println(merged(m, n, ar1, ar2));

    }


    public static int[] merged(int m, int n, int[] nums1, int[] nums2) {


        int left = m - 1;
        int right = n - 1;
        int end = m + n - 1;
        int tail1 = m - 1, tail2 = n - 1, finished = m + n - 1;
        while (tail1 >= 0 && tail2 >= 0) {
            nums1[finished--] = (nums1[tail1] > nums2[tail2]) ?
                    nums1[tail1--] : nums2[tail2--];
        }


        System.out.println(Arrays.toString(nums1));
        return nums1;

    }
}









