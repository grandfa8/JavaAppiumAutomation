import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void testGetLocalNumber() {
        int actual = this.getLocalNumber();
        int expected = 14;

        Assert.assertEquals(
                String.format("Actual '%s' number not equal expected  '%s' number", actual, expected),
                expected,
                actual
        );
    }
}
