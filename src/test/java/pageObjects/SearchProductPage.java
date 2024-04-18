package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SearchProductPage extends BasePage {

    public SearchProductPage(WebDriver driver) {
        super(driver);
    }

    int product_quantity = 2;

    private By search_field_loc = By.name("search");
    private By search_field_text = By.name("search");
    private By search_btn_loc = By.xpath("//button[@class='btn btn-default btn-lg']");
    private By macbook_product_loc = By.xpath("//div[@class='image']//img[@title='MacBook']");
    private By product_quantity_loc = By.name("quantity");
    private By add_to_cart_btn_loc = By.xpath("//button[@id='button-cart']");
    private By success_text_loc = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    private By shopping_cart_loc = By.cssSelector("div[class='alert alert-success alert-dismissible'] a:nth-child(2)");
    private By checkout_btn_loc = By.xpath("//a[@class='btn btn-primary']");


    public void click_search_field() {
        driver.findElement(search_field_loc).click();
    }

    public void search_field_text_input() {
        driver.findElement(search_field_text).sendKeys("mac");
    }

    public void click_search_btn() {
        driver.findElement(search_btn_loc).click();
    }

    public void click_macbook_product() {
        driver.findElement(macbook_product_loc).click();
    }

    public void clear_quantity_field() {
        driver.findElement(product_quantity_loc).clear();
    }

    public void enter_quantity() {
        driver.findElement(product_quantity_loc).sendKeys(String.valueOf(product_quantity));
    }

    public void select_add_to_cart_btn() {
        driver.findElement(add_to_cart_btn_loc).click();
    }

    public void product_added_to_cart_success() {
        String actual_success_text = driver.findElement(success_text_loc).getText();
        String expected_success_text = "Success: You have added MacBook to your shopping cart!";
        if (actual_success_text.equals(expected_success_text));
    }

    public void go_to_shopping_cart()
    {
        driver.findElement(shopping_cart_loc).click();
    }

    public void click_checkout_btn()
    {
        driver.findElement(checkout_btn_loc).click();
    }
}
