package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp()
    {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){

        // find log in and click on login link

//        WebElement loginLink = driver.findElement(By.linkText("Log in"));
//        loginLink.click();
        clickOnElement(By.linkText("Log in")); // Method clickOnElement is coming from utility class

        // this is from requirement
        String expectedMessage = "Welcome, Please Sign In!";

        // find the welcome text element and get the text

//        WebElement actualMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
//        String actualMessage = actualMessageElement.getText();

        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
            //  // method getTextFromElement is coming from utility class

        // Validate actual and expected by assertEquals method

        Assert.assertEquals("Not navigate to login page",actualMessage,expectedMessage);
    }


    @Test
    public void verifyErrorMessageWithInvalidCredentials()
    {
        String expectedMessage2 = "Login was unsuccessful. Please correct the errors and try again.\n"
                                + "No customer account found";

//        WebElement loginLink = driver.findElement(By.linkText("Log in"));
//        loginLink.click();
        clickOnElement(By.linkText("Log in"));

//        WebElement userName = driver.findElement(By.xpath("//input[@id='Email']"));
//        userName.sendKeys("Prime123@gmail.com");

        sendTextToElement(By.id("Email"),"Prime123@gmail.com");


//        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
//        password.sendKeys("prime123");
        sendTextToElement(By.id("Password"),"Prime123");

//        WebElement login = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
//        login.click();
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));

//        WebElement actualMessageElement = driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]"));
//        String actualmessage2 = actualMessageElement.getText();
        String actualmessage2 = getTextFromElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]"));

        Assert.assertEquals("Error message not displayed",actualmessage2,expectedMessage2);

    }

    @After
    public void tearDown()
    {
       // closeBrowser();
    }
}
