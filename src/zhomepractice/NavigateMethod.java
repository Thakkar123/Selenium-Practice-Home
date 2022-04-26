package zhomepractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) {

        String baseurl = "https://www.bbc.co.uk/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(baseurl);
        System.out.println("Title is "+ driver.getTitle());
        driver.navigate().to("https://www.facebook.com/");
        System.out.println("Title is "+ driver.getTitle());
        driver.navigate().back();
        System.out.println("Title is "+ driver.getTitle());
        driver.navigate().forward();
        System.out.println("Title is "+ driver.getTitle());

        driver.navigate().refresh();
    }
}
