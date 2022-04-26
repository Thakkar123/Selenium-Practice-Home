package xpathAxes;

import browserfactory.BaseTest1;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class precedingFollowing extends BaseTest1 {

    String baseUrl = "https://www.zoho.com/crm/?zmc=zoho-fa&ireft=ohome";
    @Before

    public void setup(){

        openBrowser(baseUrl);
    }
    @Test

    public void precedingFollowingMethod(){

        WebElement firstName = driver.findElement(By.xpath("//input[@name='password']/preceding::input[2]"));
        firstName.sendKeys("Ajit");

        WebElement mobile = driver.findElement(By.xpath("//input[@name='password']/following::input[@id='mobile']"));
        mobile.sendKeys("12345678");

    }

    @After
    public void tearDown(){
        //  closeBrowser();
    }
}

