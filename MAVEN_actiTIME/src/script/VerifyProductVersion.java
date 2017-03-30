package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.EnterTimeTrackPage;
import pom.LoginPage;

public class VerifyProductVersion extends BaseTest
{

    @Test
    public void testVerifyProductVersion() throws InterruptedException
    {
        /*       LoginPage l = new LoginPage(driver);
        l.setUserName("admin");
        l.setPassword("manager");
        l.clickLogin();
        //        Thread.sleep(2000);
        
        EnterTimeTrackPage e = new EnterTimeTrackPage(driver);
        Thread.sleep(2000);
        e.clickHelp();
        Thread.sleep(4000);
        e.clickAboutActiTIME();
        Thread.sleep(2000);
        e.verifyProductVersion("actiTIME 2017.1");
        e.clickCloseBtn();
        e.clickLogout();*/

        String un = Excel.getCellValue(INPUT_PATH, "VerifyProductVersion", 1, 0);
        String pwd = Excel.getCellValue(INPUT_PATH, "VerifyProductVersion", 1, 1);
        String version = Excel.getCellValue(INPUT_PATH, "VerifyProductVersion", 1, 2);

        LoginPage l = new LoginPage(driver);
        l.setUserName(un);
        l.setPassword(pwd);
        l.clickLogin();

        EnterTimeTrackPage e = new EnterTimeTrackPage(driver);
        Thread.sleep(2000);
        e.clickHelp();
        Thread.sleep(4000);
        e.clickAboutActiTIME();
        Thread.sleep(2000);
        e.verifyProductVersion(version);
        e.clickCloseBtn();
        e.clickLogout();

    }

}
