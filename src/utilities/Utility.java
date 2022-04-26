package utilities;

import browsertesting.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility extends BaseTest {

    /**
     * This method will click on the elment
     */
    public void clickOnElement(By by)
    {
        WebElement element = driver.findElement(by);
        element.click();
    }

    /**
     * This method will get text from element
     */
    public String getTextFromElement(By by)
    {
        return driver.findElement(by).getText();
    }

    /**
     * This method will send text element
     */
    public void sendTextToElement(By by, String text)
    {
        driver.findElement(by).sendKeys(text);
    }


    //******************************* Alert Methods *************************************************//

    /**
     * This method will switch to alert
     */

    public void switchToAlert(){
        driver.switchTo().alert();

    }

    /**
     * This method will accept to alert
     */
    public void acceptAlert(){
        driver.switchTo().alert();

    }
    //******************************* Select Methods *************************************************//

    /**
     * This method will select the option visible text
     */
    public void selectByVisibleTextFromDropDown(By by, String text){
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByVisibleText(text);
    }



}


