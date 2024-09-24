import org.junit.Assert;
import org.junit.Test;

public class Tests {

    @Test
    public void checkTrue() {
        Assert.assertTrue(Palindrome.isPalindrome("Madam"));
    }

    @Test
    public void checkFalse() {
        Assert.assertFalse(Palindrome.isPalindrome("Abduvohid"));

    }

    @Test
    public void failTest() {
        Assert.assertTrue(Palindrome.isPalindrome("Sos"));
    }
}
