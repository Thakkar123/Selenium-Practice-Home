package xpathAxes;

import browserfactory.BaseTest1;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class descendant extends BaseTest1 {

    String baseUrl = "https://www.zoho.com/crm/?zmc=zoho-fa&ireft=ohome";
    @Before

    public void setup(){

        openBrowser(baseUrl);
    }
    @Test

    public void descendantMethod(){
//        List<WebElement> LWE = driver.findElements(By.xpath("//div[@class='za-password-container sgfrm']/descendant::*"));
//        System.out.println("Size is: "+LWE.size());
//
//        for(WebElement w:LWE)
//        {
//            System.out.println("Tag Name: "+w.getTagName());
//            System.out.println("Attribute Name: "+w.getAttribute("class"));
//        }

        List<WebElement> LWE = driver.findElements(By.xpath("//div[@class='za-password-container sgfrm']/descendant-or-self::*"));
        System.out.println("Size is: "+LWE.size());

        for(WebElement w:LWE)
        {
            System.out.println("Tag Name: "+w.getTagName());
            System.out.println("Attribute Name: "+w.getAttribute("class"));
        }


    }

    @After
    public void tearDown(){
        //  closeBrowser();
    }
}
