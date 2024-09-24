import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LengthOfLastString {
    public static void main(String[] args) {
      int[] array = {9,8,7,6,5,4,3,2,1,0};


        System.out.println(Arrays.toString(plusOne(array)));

    }
    public static int[] plusOne(int[] digits) {


        for(int i = digits.length-1; i >=0 ; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i]= 0;
        }
        digits = new int[digits.length+1];
        digits[0] = 1;

        return digits;




    }
}
