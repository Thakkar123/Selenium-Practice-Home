package zhomepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassAndTagNameExample {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();

        // classname
        int slider = driver.findElements(By.className("homeslider-container")).size();
        System.out.println("Number of arrow: " +slider);
        //Tag name
        int links = driver.findElements(By.tagName("a")).size();
        System.out.println("Number of links: "+links);


    }
}
