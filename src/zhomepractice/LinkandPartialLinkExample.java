package zhomepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkandPartialLinkExample {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");

        driver.manage().window().maximize(); // maximize web page


        // id & name locators
        //WebElement searchbox=driver.findElement(By.id("search_query_top"));
        WebElement searchbox=driver.findElement(By.xpath("//input[@id = 'search_query_top']"));
        searchbox.sendKeys("T-shirts");

        driver.findElement(By.name("submit_search")).click();

        //linkText & partial linkText
        //driver.findElement(By.linkText("Blouse")).click();
       driver.findElement(By.partialLinkText("Fadded Short")).click();

    }
}
