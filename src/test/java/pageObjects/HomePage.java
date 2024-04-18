package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

     public HomePage(WebDriver driver) {
        super(driver);
    }

        //Homepage elements & locators
        private By my_Account_Loc = By.xpath("//a[@title='My Account']");
        private By register_Btn_Loc = By.xpath("//a[normalize-space()='Register']");
        private By page_title = By.xpath("//h1[normalize-space()='Register Account']");
        private By Login_btn_loc = By.xpath("//a[normalize-space()='Login']");


        //actions
        public void clickMyAccount_Loc()
        {
            driver.findElement(my_Account_Loc).click();
        }

        public void clickRegister_Btn_Loc()
        {
            driver.findElement(register_Btn_Loc).click();
        }

        public void title_of_page(String title)
        {
            driver.findElement(page_title).isDisplayed();
        }

        public void click_Login_btn()
        {
            driver.findElement(Login_btn_loc).click();
        }
    }
