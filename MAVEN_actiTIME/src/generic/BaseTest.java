package generic;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements AutoConst
{

    public WebDriver driver;

    @BeforeMethod
    public void openApplication() throws MalformedURLException
    {
        System.setProperty(CHROME_KEY, CHROME_VALUE);
//        System.out.println(System.getProperty("webdriver.chrome.driver")+"------------------------------------------------------");

        // If we again declare WebDriver driver below we will get null
        // pointer exception, so declare only once and make use of it
        // WebDriver driver = new FirefoxDriver();
        // driver = new FirefoxDriver();

        /*    driver = new ChromeDriver();
        driver.get("http://localhost:8080/login.do");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/

        URL rsURL = new URL("http://192.168.10.32:4444/wd/hub");
        DesiredCapabilities d = new DesiredCapabilities();
        d.setBrowserName("chrome");
        d.setPlatform(Platform.WIN10);
        
        driver = new RemoteWebDriver(rsURL, d);
        driver.get("http://localhost:8080/login.do");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void closeApplication()
    {

        driver.quit();
    }

}
