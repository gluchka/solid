import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class FactoryTest {

    private String name;

    @Factory(dataProvider = "dp")
    public FactoryTest(String name) {
        this.name = name;
    }

    @DataProvider
    static public Object[][] dp() {
        return new Object[][] {
                new Object[] { "Anton" },
                new Object[] { "Cedric" },
                new Object[] { "Lenny" }
        };
    }

    @Test
    public void testFabric()  {
        System.out.println(name);
        assert name.equals("Lenny");
    }
}
