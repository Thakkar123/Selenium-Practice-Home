package zhomepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathmore {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
        driver.manage().window().maximize();
           //  example if i need to add this email to newsletter box

        WebElement text = driver.findElement(By.xpath("//input[@type='email']"));
        text.sendKeys("abc@yahoo.com");

//        WebElement text = driver.findElement(By.xpath("//input[@name='NewsletterEmail']"));
//        text.sendKeys("abc@yahoo.com");



    }
}