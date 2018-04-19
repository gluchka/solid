import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @DataProvider(name = "listOfNumbers")
    public Object[][] createData1() {
        return new Object[][]{
                {"first", "one"},
                {"second", "two"},
        };
    }

    @Test(dataProvider = "listOfNumbers")
    public void testDataProvider(String number, String digit) throws Exception {
        System.out.println(number + "->" + digit);
        assert number.equals("first");
    }
}
