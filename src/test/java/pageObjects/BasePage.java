package pageObjects;

import org.openqa.selenium.WebDriver;

public class BasePage {

    //create a webdriver  instance
    WebDriver driver;

    //create a constructor
     BasePage(WebDriver driver)
    {
        this.driver=driver;
    }


}
