package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeOptionExample {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");  // Disable Browser Notifications
        options.addArguments("--incognito");  // Open the Browser in incognito in private window
        options.addArguments("--headless");  // Open headless browser

        String baseurl = "https://courses.letskodeit.com/practice";

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(options); // Here you have to pass that options object

        // driver.get method will launch the url
        driver.get(baseurl);

        // this method will maximise the opened url
        driver.manage().window().maximize();

        // this method will  give implicit time wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String title = driver.getTitle();
        System.out.println("Title is: "+title);

    }
}