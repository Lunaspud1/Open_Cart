package testCases;

import com.beust.ah.A;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.AccountLoginPage;
import pageObjects.LogoutPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

import java.util.ResourceBundle;

public class TC_002_AccountloginTest extends BaseClass {


    @Test
    public void test_account_login()
    {
         logger.info("************Start TC_002_AccountLoginTest***************");

        HomePage hp = new HomePage(driver);
        hp.clickMyAccount_Loc();
        hp.click_Login_btn();

        AccountLoginPage lp = new AccountLoginPage(driver);

        logger.info("Providing existing user details");

        lp.enter_user_email();
        lp.enter_user_password();
        lp.click_login_btn();
        logger.info("Clicked on login button...");

        MyAccountPage myacc = new MyAccountPage(driver);
        myacc.my_account_pageTitle();
        myacc.set_logout_btn();
        logger.info("selecting logout button");


        LogoutPage lop = new LogoutPage(driver);
        lop.account_logout();
        logger.info("Test Passed/Failed");

        logger.info("******Finished test_account_login_test********");
    }




}
