package xpathAxes;

import browserfactory.BaseTest1;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ancestor extends BaseTest1 {

    String baseUrl = "https://www.zoho.com/crm/?zmc=zoho-fa&ireft=ohome";
    @Before

    public void setup(){

       openBrowser(baseUrl);
    }
    @Test

    public void ancestorMethod(){
//        List<WebElement> LWE = driver.findElements(By.xpath("//input[@class='sgnpaswrd']/ancestor::*"));
//        System.out.println("Size is: "+LWE.size());
//
//        for(WebElement w:LWE)
//        {
//            System.out.println("Tag Name: "+w.getTagName());
//            System.out.println("Attribute Name: "+w.getAttribute("class"));
//        }

        List<WebElement> LWE = driver.findElements(By.xpath("//input[@class='sgnpaswrd']/ancestor-or-self::*"));
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
