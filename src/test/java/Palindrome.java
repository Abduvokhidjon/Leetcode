import java.util.Arrays;
import java.util.Collections;

public class Palindrome {
    public static void main(String[] args) {
        String name  = "Abduvohid";

        System.out.println(isPalindrome("0P"));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String clean = "";

        for(int i = 0; i < s.length(); i++) {
            if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
                clean += s.charAt(i);
            }
        }

        char[] array1 = clean.toCharArray();
        char[] array2 = new char[clean.length()];

        for(int i = 0, j = array2.length-1; i < array1.length; i++, j--) {
            array2[j] = array1[i];
        }

        return Arrays.equals(array1, array2);
    }
}
