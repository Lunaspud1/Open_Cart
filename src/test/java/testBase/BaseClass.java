package testBase;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import java.io.IOException;
import java.time.Duration;
import java.util.ResourceBundle;

public class BaseClass {

    public WebDriver driver;
    public Logger logger;

    @BeforeClass
    public void setup()
    {


        //read data from property file
        //option1
        ResourceBundle rb = ResourceBundle.getBundle("config");
        rb.getString("appURL");
        //rb.getString("adminEMAIL");
        //rb.getString("adminPASSWORD");

        //option2
//        FileReader file = new FileReader("/home/ademiju/IdeaProjects/opencart/src/test/resources/config.properties");
//        Properties p = new Properties();
//        p.load(file);
//        String url=p.getProperty("appURL");

//        if (br.equalsIgnoreCase("chrome"))
//        {
//            driver=new ChromeDriver();
//        }
//        else if (br.equalsIgnoreCase("firefox"))
//            driver=new FirefoxDriver();
//        else
//        {
//            driver=new EdgeDriver();

        logger= (Logger) LogManager.getLogger(this.getClass());
//        }

        //don't display chrome is being controlled by automation test software
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});

        driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get(rb.getString("appURL")); //local app url ResourceBundle (option1)
        //driver.get(rb.getString("adminEMAIL")); //from config.property file
        //driver.get(rb.getString("adminPASSWORD")); //from config.property file

        //driver.get(url); //local app url Filereader (option2)
    }

    public String pwd = randomAlphaNumerics();

//    @AfterClass
//    public void tearDown()
//    {
//        driver.close();
//    }

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
