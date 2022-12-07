package seleniumWorks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateMethods {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");
        driver.navigate().to("https://www.trendyol.com");

        driver.navigate().back(); // amazon
        driver.navigate().forward(); // trendyol

        driver.navigate().refresh(); // refreshPage

        driver.close(); // close browser

        // driver.quit(); // close all browser
    }
}
