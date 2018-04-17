import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {

    @Test
    @Parameters({"myName"})
    public void testWithParameters(String myName) throws Exception {
        System.out.println(myName);
        assert myName.equals("John");
    }
}
