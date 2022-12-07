package seleniumWorks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class manageMethods {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        System.out.println(driver.manage().window().getSize());// (x,y) pixel
        System.out.println("*".repeat(100));

        System.out.println(driver.manage().window().getPosition()); // (x,y)

        driver.manage().window().setPosition(new Point(25,35));

        driver.manage().window().setSize(new Dimension(800,600));

        System.out.println("*".repeat(100));
        System.out.println("new window size : " + driver.manage().window().getSize());
        System.out.println("new window position : " + driver.manage().window().getPosition());

        System.out.println("=".repeat(100));
        driver.manage().window().maximize();
        System.out.println("new window size : " + driver.manage().window().getSize());
        System.out.println("new window position : " + driver.manage().window().getPosition());

        System.out.println("*".repeat(100));
        driver.manage().window().fullscreen();
        System.out.println("new window size : " + driver.manage().window().getSize());
        System.out.println("new window position : " + driver.manage().window().getPosition());
        System.out.println("*".repeat(100));

        driver.manage().window().minimize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.quit();
    }
}
