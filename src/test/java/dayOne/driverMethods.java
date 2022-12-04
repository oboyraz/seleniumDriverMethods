package dayOne;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverMethods {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");
        System.out.println("page title : " + driver.getTitle());
        System.out.println("=".repeat(100));
        System.out.println("page url: " + driver.getCurrentUrl());
        System.out.println("=".repeat(100));
        System.out.println(driver.getPageSource());
        System.out.println("=".repeat(100));
        System.out.println(driver.getWindowHandle()); // page unique hash code
        System.out.println("*".repeat(100));

    }
}
