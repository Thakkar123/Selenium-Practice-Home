package zhomepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingClickMethod {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://en-gb.facebook.com/");
        driver.manage().window().maximize(); // capture all the cookies from browser

        driver.findElement(By.id("email")).sendKeys("thakkarajit@yahoo.co.in");
        driver.findElement(By.id("pass")).sendKeys("65waltonavenue");
        driver.findElement(By.name("login")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@class='d2edcug0 hpfvmrgz qv66sw1b c1et5uql lr9zc1uh a8c37x1j fe6kdd0r mau55g9w c8b282yb keod5gw0 nxhoafnm aigsh9s9 d3f4x2em iv3no6db jq4qci2q a3bd9o3v lrazzd5p bwm1u5wc']//span[@class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7 ltmttdrg g0qnabr5'][normalize-space()='Allow all cookies']")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
        driver.findElements(By.id("u_0_m_7V"));
    }

}
