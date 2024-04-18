package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LogoutPage extends BasePage {


    public LogoutPage(WebDriver driver) {
        super(driver);
    }

    private By logout_page_loc = By.xpath("//h1[normalize-space()='Account Logout']");


    public void account_logout()
    {
        String expected_logout_text = driver.findElement(logout_page_loc).getText();
        String actual_logout_text = "Account Logout";
        Assert.assertEquals(actual_logout_text, expected_logout_text);
    }
}

