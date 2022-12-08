package seleniumWorks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;



public class testIgnoreNotation {
    static WebDriver driver;

    @BeforeClass //must be static
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterClass //must be static
    public static void tearDown(){
        driver.close();
    }

    @Test
    public void test01(){
        driver.get("https:www.amazon.com");
        driver.getTitle();
        driver.getCurrentUrl();
    }

    @Test @Ignore
    public void test02(){
        driver.get("https:www.bestbuy.com");
        driver.getTitle();
        driver.getCurrentUrl();
    }

    @Test
    public void test03(){
        driver.get("https:www.facebook.com");
        driver.getTitle();
        driver.getCurrentUrl();
    }
}
