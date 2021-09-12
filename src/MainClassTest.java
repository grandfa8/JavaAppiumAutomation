import org.junit.Assert;
import org.junit.Test;


public class MainClassTest extends MainClass {
    @Test
    public void testGetClassString() {
        String actual = this.getClassString();
        String expected = "hello|Hello";

        Assert.assertTrue(
                failedContainsSubstringMessage(actual, expected),
                stringContains(actual, expected)
        );
    }

    private String failedContainsSubstringMessage(String actual, String expected) {
        String msgTemplate = "Actual string '%s' does not contain at least one of the expected substring: '%s'";
        return String.format(msgTemplate, actual, expected);
    }

    private boolean stringContains(String actual, String expected) {
        String[] substrings = expected.split("\\|");

        boolean result = false;
        for (String substring : substrings) {
            System.out.println(substring);
            result = actual.contains(substring);
            if (result) {
                break;
            }
        }
        return result;
    }
}
