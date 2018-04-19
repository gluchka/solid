import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {

    @Test
    @Parameters({"number"})
    public void testWithParameters1(String number) throws Exception {
        System.out.println(number);
        assert number.equals("first");
    }
    @Test
    @Parameters({"number"})
    public void testWithParameters2(String number) throws Exception {
        System.out.println(number);
        assert number.equals("second");
    }
}
