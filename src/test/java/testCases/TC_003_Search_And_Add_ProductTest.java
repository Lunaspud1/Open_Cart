package testCases;

import org.testng.annotations.Test;
import pageObjects.AccountLoginPage;
import pageObjects.HomePage;
import pageObjects.MyAccountPage;
import pageObjects.SearchProductPage;
import testBase.BaseClass;

public class TC_003_Search_And_Add_ProductTest extends BaseClass {


    @Test
    public void search_and_add_product_test(){

        HomePage hp = new HomePage(driver);
        hp.clickMyAccount_Loc();
        hp.click_Login_btn();

        AccountLoginPage alp = new AccountLoginPage(driver);
        alp.enter_user_email();
        alp.enter_user_password();
        alp.click_login_btn();

        SearchProductPage spp = new SearchProductPage(driver);
        spp.click_search_field();
        spp.search_field_text_input();
        spp.click_search_btn();
        spp.click_macbook_product();
        spp.clear_quantity_field();
        spp.enter_quantity();
        spp.select_add_to_cart_btn();
        spp.product_added_to_cart_success();



    }

}
