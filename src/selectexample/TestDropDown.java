package selectexample;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.Utility;

import java.util.List;

public class TestDropDown extends Utility{

    String baseUrl = "http://way2automation.com/way2auto_jquery/index.php";

    @Before
    public void setUp()
    {
        openBrowser(baseUrl);
    }

    @Test
    public void dropDownExample(){

        WebElement dropDown = driver.findElement(By.name("country"));
        Select select = new Select(dropDown);
        // Select by value
        select.selectByValue("Canada");
        //select by visible text
        select.selectByVisibleText("Finland");

        //selectByVisibleTextFromDropDown(By.name("country"),"Finland"); - method calling from utility class

        //select by Index number
        select.selectByIndex(2);

        List<WebElement> alloptions = select.getOptions();
        System.out.println(alloptions.size());

        for(WebElement element:alloptions ){
            System.out.println(element.getText());
            if(element.getText().equals("Singapore")){
                element.click();
            }
        }
    }

}
