import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void testGetLocalNumber() {
        int actual = this.getLocalNumber();
        int expected = 14;

        Assert.assertEquals(
                this.notEqualsNumberMessage(actual, expected),
                expected,
                actual
        );
    }

    private String notEqualsNumberMessage(int actual, int expected) {
        String msgTemplate = "Actual number '%s' not equal expected number '%s'";
        return String.format(msgTemplate, actual, expected);
    }
}
