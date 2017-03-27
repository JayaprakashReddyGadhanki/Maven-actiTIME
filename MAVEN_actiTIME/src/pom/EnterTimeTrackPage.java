package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import generic.BasePage;

public class EnterTimeTrackPage extends BasePage
{

    @FindBy(id = "logoutLink")
    private WebElement logoutLink;

    @FindBy(xpath = "(//div[@class='popup_menu_icon support_icon'])[last()]")
    private WebElement help;

    @FindBy(xpath = "//a[contains(.,'About your actiTIME')]")
    private WebElement aboutActiTIME;

    @FindBy(xpath = "//span[.='actiTIME 2017.1']")
    private WebElement productVersion;

    @FindBy(xpath = "//img[@title='Close']")
    private WebElement closeBtn;

    public EnterTimeTrackPage(WebDriver driver)
    {

        super(driver);
    }

    public void clickLogout()
    {
        logoutLink.click();
    }

    public void clickHelp()
    {
        help.click();
    }

    public void clickAboutActiTIME()
    {

        aboutActiTIME.click();
    }

    public void verifyProductVersion(String eVersion)
    {

        String aVersion = productVersion.getText();
        Assert.assertEquals(aVersion, eVersion);

    }

    public void clickCloseBtn()
    {
        closeBtn.click();

    }

}
