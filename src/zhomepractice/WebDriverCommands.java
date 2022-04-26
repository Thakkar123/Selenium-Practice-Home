package zhomepractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

    public static void main(String[] args) {

        String baseurl = "https://www.bbc.co.uk//";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(baseurl);  // to open the url
        // to return the title  of the page
        System.out.println("Title is "+ driver.getTitle());
        // to return the title  of the page
        System.out.println("Current URL is "+ driver.getCurrentUrl());
    }
}
