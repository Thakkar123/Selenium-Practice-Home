package zhomepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class XpathAxes {
    public static void main(String[] args) {
        // xpath Axes method by Ajit
        // xpath Axes method by Ajit
        // xpath Axes method by Ajit
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
       // WebElement text = driver.findElement(By.xpath("//a[contains(text(),'Log in')]"));
       //WebElement text = driver.findElement(By.xpath("//a[contains(text(),'Log in')]/self::a"));
      // WebElement text = driver.findElement(By.xpath("//a[contains(text(),'Log in')]/parent::li"));
       List<WebElement> text = driver.findElements(By.xpath("//a[contains(text(),'Log in')]/ancestor::ul/child::li"));
        System.out.println(text.size());


    }
}
