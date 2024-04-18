package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MyAccountPage extends BasePage {

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    private By my_account_page = By.xpath("//h2[normalize-space()='My Account']");
    private By logout_btn_loc = By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']");


    public void my_account_pageTitle() {
        String account_page_title = driver.findElement(my_account_page).getText();
        String actual_login_page_title = "My Account";
        Assert.assertEquals(actual_login_page_title, account_page_title);
    }

    public void set_logout_btn()
    {
        driver.findElement(logout_btn_loc).click();
    }
}