package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocatorDemo1 extends BaseTest {

    String baseUrl = "http://automationpractice.com/index.php/";

    @Before
    public void setUp()
    {
        openBrowser(baseUrl);
    }

    @Test
    public void locatorDemoTest1()
    {
        // ID and Name Locators
        WebElement searchBox = driver.findElement(By.id("search_query_top"));
        searchBox.sendKeys("T-Shirt");

        /*WebElement searchBtn = driver.findElement(By.name("submit_search"));
        searchBtn.click();*/

        driver.findElement(By.name("submit_search")).click();

        // Linked text locators
        driver.findElement(By.linkText("Printed chiffon Dress")).click();  // linked text
       // driver.findElement(By.partialLinkText("chiffon Dress")).click(); // Partial linked text


    }

    @After
    public void tearDown()
    {
        //closeBrowser();
    }


}
