import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tests {

    WebDriver wd;

    @BeforeMethod
    public void preCondition(){
        wd = new ChromeDriver();
//        wd.get("https://ilcarro-1578153671498.web.app/search");
        wd.navigate().to("https://ilcarro-1578153671498.web.app/search");

    }

    @Test
    public void TestOne(){

    }

    @AfterMethod
    public void postCondition(){

    }

}
