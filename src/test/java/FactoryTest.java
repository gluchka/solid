import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class FactoryTest {

    private String number;

    @Factory(dataProvider = "data")
    public FactoryTest(String number) {
        this.number = number;
    }

    @DataProvider
    static public Object[][] data() {
        return new Object[][]{
                {"first"},
                {"second"},
                {"third"}
        };
    }

    @Test
    public void testFabric() {
        System.out.println(number);
        assert ("firstsecondthird").contains(number);
    }
}
