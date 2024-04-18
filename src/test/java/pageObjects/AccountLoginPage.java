package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.ResourceBundle;

public class AccountLoginPage extends BasePage{

    public AccountLoginPage(WebDriver driver) {
        super(driver);

    }

    private By user_email_addr_loc = By.xpath("//input[@id='input-email']");
    private By user_password_loc = By.xpath("//input[@id='input-password']");
    private By login_btn_loc = By.xpath("//input[@value='Login']");

    public void enter_user_email()
    {
        driver.findElement(user_email_addr_loc).sendKeys("admin@admin.com");
    }

    public void enter_user_password()
    {
        driver.findElement(user_password_loc).sendKeys("1234");
     }

     public void  click_login_btn()
     {
         driver.findElement(login_btn_loc).click();
     }



}
