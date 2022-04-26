package alertexample;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import utilities.Utility;

public class TestAlert extends Utility{

    String baseUrl = "https://mail.rediff.com/cgi-bin/login.cgi";

    @Before
    public void setUp()
    {
        openBrowser(baseUrl);
    }

    @Test
    public void alertExample(){
        clickOnElement(By.name("proceed")); // click on sign in button
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept(); // accepting alert
        //alert.dismiss(); // dismiss alert
       // alert.sendKeys("Ajit");  // send text to alert

    }

}
