package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.EnterTimeTrackPage;
import pom.LoginPage;

public class ValidLoginLogout extends BaseTest
{

    @Test
    public void testValidLoginLogout() throws InterruptedException
    {

        /* BEFORE UPDATING WITH EXCEL- */
        LoginPage l = new LoginPage(driver);
        l.setUserName("admin");
        l.setPassword("manager");
        l.clickLogin();

        EnterTimeTrackPage e = new EnterTimeTrackPage(driver);
        // Thread.sleep(2000);
        e.verifyTitle("actiTIME - Enter Time-Track");
        Thread.sleep(2000);
        e.clickLogout();
        e.verifyTitle("actiTIME - Login");

        /*        String un = Excel.getCellValue(INPUT_PATH, "ValidLoginLogout", 1, 0);
        String pwd = Excel.getCellValue(INPUT_PATH, "ValidLoginLogout", 1, 1);
        String homeTitle = Excel.getCellValue(INPUT_PATH, "ValidLoginLogout", 1, 2);
        String loginTitle = Excel.getCellValue(INPUT_PATH, "ValidLoginLogout", 1, 3);
        
        LoginPage l = new LoginPage(driver);
        l.setUserName(un);
        l.setPassword(pwd);
        l.clickLogin();
        
        EnterTimeTrackPage e = new EnterTimeTrackPage(driver);
        e.verifyTitle(homeTitle);
        Thread.sleep(2000);
        e.clickLogout();
        e.verifyTitle(loginTitle);*/

    }

}
