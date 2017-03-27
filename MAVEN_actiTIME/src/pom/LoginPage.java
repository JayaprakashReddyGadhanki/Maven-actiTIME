package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.BasePage;

public class LoginPage extends BasePage
{
    @FindBy(id = "username")
    WebElement unTB;

    @FindBy(name = "pwd")
    WebElement pwTB;

    @FindBy(xpath = "//div[.='Login ']")
    WebElement loginBtn;

    @FindBy(xpath = "//span[contains(.,'invalid')]")
    WebElement errMsg;

    public LoginPage(WebDriver driver)
    {
        super(driver);
    }

    public void setUserName(String un)
    {

        unTB.sendKeys(un);
    }

    public void setPassword(String pw)
    {
        pwTB.sendKeys(pw);
    }

    public void clickLogin()
    {
        loginBtn.click();
    }

    public void verifyErrMsg()
    {

        verifyElementIsPresent(errMsg);
    }

}
