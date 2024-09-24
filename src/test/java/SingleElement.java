public class SingleElement {
    public static void main(String[] args) {
        int [] arr = {4, 6, 5, 7, 5, 6, 3, 4 , 7};
        System.out.println(singleNumber(arr));


    }
    public static int singleNumber(int[] nums) {
        int result = 0;

        for(int i = 0; i < nums.length; i++){
            result ^= nums[i];
        }

        return result;
    }
}
