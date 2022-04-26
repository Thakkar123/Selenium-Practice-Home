package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args) {

        String baseurl = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // driver.get method will launch the url
        driver.get(baseurl);

        // this method will maximise the opened url
        driver.manage().window().maximize();

        // this method will  give implicit time wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // to get the title of page we use the getTitle method and here we are assigning that title to string variable title and print
        String title = driver.getTitle();
        System.out.println(title);

        //Get current URL we use getCurrentUrl method, here we are using method inside print statement
        System.out.println("Current URL = "+driver.getCurrentUrl());

        // driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F"); // you can also declare like this
        // you can navigate to given url
        String loginurl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        driver.navigate().to(loginurl);
        System.out.println("Current URL = "+driver.getCurrentUrl());


        // find the email field element
        WebElement emailfield = driver.findElement(By.id("Email"));
        // sending email to email field element
        emailfield.sendKeys("Prime123@gmail.com");

        //find the password field element
        WebElement passwordfield = driver.findElement(By.name("Password"));
        //sending password to password field element
        passwordfield.sendKeys("Password123");

       // to close the browser automatically
       //driver.close();
    }
}
