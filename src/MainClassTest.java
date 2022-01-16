import org.junit.Assert;
import org.junit.Test;


public class MainClassTest extends MainClass {
    @Test
    public void testGetClassNumber() {
        int actual = this.getClassNumber();
        int expected = 45;

        Assert.assertTrue(
                String.format("Actual number '%s' less or equal than expected number '%s'", actual, expected),
                actual > expected
        );
    }
}
