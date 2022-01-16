import org.junit.Assert;
import org.junit.Test;


public class MainClassTest extends MainClass {
    @Test
    public void testGetClassString() {
        Assert.assertTrue(
                "GetClassString don't have 'Hello' or 'hello'.",
                this.getClassString().contains("hello") || this.getClassString().contains("Hello")
        );
    }
}
