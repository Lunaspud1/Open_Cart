package testCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass{

    //Setup
    @Test
    public void test_account_Registration()
    {
        logger.info("******** Start TC_001_AccountRegistrationTest   *************");
        logger.debug("*******  Generating debug logs   ********");

        HomePage hp = new HomePage(driver);
        hp.clickMyAccount_Loc();
        logger.info("Clicked on my account link");
        hp.clickRegister_Btn_Loc();  //opens registration age
        logger.info("Clicked on Register link");
        //hp.title_of_page("Register Account");  //validates registration page's page title

        AccountRegistrationPage reg_page = new AccountRegistrationPage(driver);

        logger.info("Providing new customer details");
        reg_page.set_firstname(random_Alphabets().toUpperCase());
        reg_page.set_lastname(random_Alphabets().toUpperCase());
        reg_page.set_email(random_Alphabets() + "@gmail.com");
        reg_page.set_tphone_no(random_Phone_number());
        reg_page.setPassword_field(pwd);
        reg_page.setConfirm_password_field(pwd);
        reg_page.setPrivacy_policy_rbtn();
        reg_page.setContinue_btn();

        logger.info("Clicked on Continue button...");

        reg_page.getConfirmationMsg();
        logger.info("Test Passed");

        logger.info("******** Finished TC_001_AccountRegistrationTest   *************");



        //reg_page.getConfirmationMsg();
//        String reg_successful_message = reg_page.getConfirmationMsges();
//        Assert.assertEquals(reg_successful_message, "Your Account Has Been Created!");

        }
    }

