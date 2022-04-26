package zhomepractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseQuit {
    public static void main(String[] args) {

        String baseurl = "http://www.dummysoftware.com/popupdummy_testpage.html";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.close(); // close the current window
       // driver.quit(); // close multiple windows

        // Another example
        //http://demo.automationtesting.in/Windows.html

   }
}
