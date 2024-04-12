package testBase;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.time.Duration;
import java.util.Random;

public class BaseClass {

    public WebDriver driver;
    public Logger logger;

    @BeforeClass
    public void setup(String br)
    {
        logger= (Logger) LogManager.getLogger(this.getClass());

//        if (br.equalsIgnoreCase("chrome"))
//        {
//            driver=new ChromeDriver();
//        }
//        else if (br.equalsIgnoreCase("firefox"))
//            driver=new FirefoxDriver();
//        else
//        {
//            driver=new EdgeDriver();
//        }

        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://localhost/opencart/upload/index.php"); //local app url
    }

    public String pwd = randomAlphaNumerics();

    @AfterClass
    public void tearDown()
    {
        driver.close();
    }

    public String random_Alphabets()
    {
        String generatedString= RandomStringUtils.randomAlphabetic(5);
        return generatedString;
    }

    public String randomNumbers()
    {
        String generatedNumbers = RandomStringUtils.randomNumeric(3);
        return generatedNumbers;
    }

    public String random_Phone_number()
    {
        String generatedPhoneNumber = RandomStringUtils.randomNumeric(11);
        return generatedPhoneNumber;
    }

    public String randomAlphaNumerics()
    {
        String generatedAlphaNumeric = RandomStringUtils.randomAlphanumeric(8);
        return generatedAlphaNumeric;
    }
}
