import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {

    @Test
    public  void testAbbr() {
        String result = MainApp.abbr("Sergey",4);
        Assert.assertEquals(result, "S...");
    }


}
