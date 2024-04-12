package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AccountRegistrationPage extends BasePage {

    public AccountRegistrationPage(WebDriver driver) {
        super(driver);
    }

    //Registrationpage elements

    private By firstname_loc = By.xpath("//input[@id='input-firstname']");
    private By lastname_loc = By.xpath("//input[@id='input-lastname']");
    private By email_loc = By.xpath("//input[@id='input-email']");
    private By telephone_no_loc = By.xpath("//input[@id='input-telephone']");
    private By password_field_loc = By.xpath("//input[@id='input-password']");
    private By confirm_password_field_loc = By.xpath("//input[@id='input-confirm']");
    private By privacy_policy_rbtn_loc = By.xpath("//input[@name='agree']");
    private By continue_btn_loc = By.xpath("//input[@value='Continue']");
    private By msgConfirmation = By.xpath("//h1[normalize-space()='Your Account Has Been Created!']");

    //action
    public void set_firstname(String users_fname) {
        driver.findElement(firstname_loc).sendKeys(users_fname);
    }

    public void set_lastname(String users_lname) {
        driver.findElement(lastname_loc).sendKeys(users_lname);
    }

    public void set_email(String users_email) {
        driver.findElement(email_loc).sendKeys(users_email);
    }

    public void set_tphone_no(String users_phone_no) {
        driver.findElement(telephone_no_loc).sendKeys(users_phone_no);
    }

    public void setPassword_field(String password) {
        driver.findElement(password_field_loc).sendKeys(password);
    }

    public void setConfirm_password_field(String password) {
        driver.findElement(confirm_password_field_loc).sendKeys(password);
    }

    public void setPrivacy_policy_rbtn() {
        driver.findElement(privacy_policy_rbtn_loc).click();
    }

    public void setContinue_btn() {
        driver.findElement(continue_btn_loc).click();
    }

    public void getConfirmationMsg() {
        String display_msg= driver.findElement(msgConfirmation).getText();
        String reg_success_msg = "Your Account Has Been Created!";
        Assert.assertEquals(display_msg, reg_success_msg);  //hard assertion

//        if (display_msg.equals(reg_success_msg))
//        {
//            System.out.println("Test Passed");
//            Assert.assertTrue(true);
//        }
//        else
//        {
//            System.out.println("Test Failed");
//            Assert.assertTrue(false);
//        }
    }
    }