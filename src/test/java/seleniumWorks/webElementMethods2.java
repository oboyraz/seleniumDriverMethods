package seleniumWorks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

//Go to https://www.facebook.com
//If cookies appear, press the accept button.
//enter a random mail in the e-mail box
//Enter a random password in the password field
//press the login button
//"The email or mobile number you entered isn't connected to an account." test the message is output
//close the page

public class webElementMethods2 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https:www.facebook.com");

        WebElement epostaBox = driver.findElement(By.xpath("//input[@id='email']"));
        epostaBox.sendKeys("Hjdfsfjjdfsdf");

        WebElement passBox = driver.findElement(By.xpath("//input[@id='pass']"));
        passBox.sendKeys("dsfkjsdfjkdsf");

        driver.findElement(By.xpath("//button[@name='login']")).click();

        WebElement textResultElement = driver.findElement(By.xpath("//div[@class='_9ay7']"));
        String expectedResult = "The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
        String actualResult = textResultElement.getText();

        if (expectedResult.equals(actualResult)){
            System.out.println("passed");
            System.out.println("");
        }
        else{
            System.out.println("failed");
        }

        driver.close();

    }

}
