import java.util.Arrays;
import java.util.Map;

public class CommonSubstring {
    public static void main(String[] args) {

        String[] strs = {"flower","flow","flight"};
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));


        System.out.println(longestCommonPrefix(strs));


    }

    public static String longestCommonPrefix(String[] strs) {

        String commonSub = "";


        if(strs == null || strs.length == 0) { return commonSub;}


        if(strs.length == 1) {
            return strs[0];
        }

        Arrays.sort(strs);

        int smallest = strs[0].length();

        for(int i = 0; i < strs.length; i++) {
            if(strs[i].length() < smallest) {
                smallest = strs[i].length();
            }
        }

        for(int i = 0; i < smallest; i++) {
            if(strs[0].charAt(i) == strs[1].charAt(i)) {
                commonSub += strs[0].charAt(i);
            }
        }

        return commonSub;


    }
}

