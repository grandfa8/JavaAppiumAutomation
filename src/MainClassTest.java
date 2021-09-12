import org.junit.Assert;
import org.junit.Test;


public class MainClassTest extends MainClass {
    @Test
    public void testGetClassNumber() {
        int actual = this.getClassNumber();
        int expected = 45;

        Assert.assertTrue(
                this.failedGreaterThanNumberMessage(actual, expected),
                greaterThan(actual, expected)
        );
    }

    private String failedGreaterThanNumberMessage(int actual, int expected) {
        String msgTemplate = "Actual number '%s' less or equal than expected number '%s'";
        return String.format(msgTemplate, actual, expected);
    }

    private boolean greaterThan(int actual, int expected) {
        if (actual > expected) {
            return true;
        } else {
            return false;
        }
    }
}
