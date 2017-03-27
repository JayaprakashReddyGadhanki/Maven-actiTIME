package script;



import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.LoginPage;

public class InvalidLogin extends BaseTest
{
    @Test
    public void invalidLogin() throws InterruptedException
    {
        /*        LoginPage l = new LoginPage(driver);
        l.setUserName("adam");
        l.setPassword("dameger");
        l.clickLogin();
        l.verifyErrMsg();
        l.verifyTitle("actiTIME - Login");*/

        Excel ex = new Excel();
        int rc = ex.getRowCount(INPUT_PATH, "InvalidLogin");

        for (int i = 1; i <= rc; i++)
        {

            String un = Excel.getCellValue(INPUT_PATH, "InvalidLogin", i, 0);
            String pwd = Excel.getCellValue(INPUT_PATH, "InvalidLogin", i, 1);
            LoginPage l = new LoginPage(driver);
            l.setUserName(un);
            l.setPassword(pwd);
            l.clickLogin();
            // Without specifying the below 2 secs sleep it was not
            // verifying error message and it was failing
            Thread.sleep(2000);
            l.verifyErrMsg();
            l.verifyTitle("actiTIME - Login");
        }

    }

}
