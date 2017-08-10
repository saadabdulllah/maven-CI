import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by saadabdullah on 8/9/17.
 */
public class TestClass {

    WebDriver driver;

    @Before
    public void setUp(){
        ChromeDriverManager.getInstance().arch32().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

    }

    @Test
    public void test(){
        driver.navigate().to("https://www.google.com/");
    }

    @After
    public void teatDown(){
        if(driver != null){
            driver.close();
            driver.quit();
        }

    }
}
