import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @DataProvider(name = "nameProvider")
    public Object[][] createData1() {
        return new Object[][] {
                { "John" },
                { "Cedric" },
        };
    }

    @Test(dataProvider = "nameProvider")
    public void testDataProvider(String userName) throws Exception {
        System.out.println(userName);
        assert userName.equals("John");
    }
}
