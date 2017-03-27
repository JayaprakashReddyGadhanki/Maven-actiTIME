package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements AutoConst
{

    public WebDriver driver;

    @BeforeMethod
    public void openApplication()
    {
        System.setProperty(CHROME_KEY, CHROME_VALUE);

        // If we again declare WebDriver driver below we will get null
        // pointer exception, so declare only once and make use of it
        // WebDriver driver = new FirefoxDriver();
        // driver = new FirefoxDriver();

        driver = new ChromeDriver();
        driver.get("http://localhost:8080/login.do");
        // driver.get("http://www.google.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void closeApplication()
    {

        driver.quit();
    }

}
