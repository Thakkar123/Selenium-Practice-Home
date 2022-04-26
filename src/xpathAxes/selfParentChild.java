package xpathAxes;

import browserfactory.BaseTest1;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class selfParentChild extends BaseTest1 {

    String baseUrl = "https://www.zoho.com/crm/?zmc=zoho-fa&ireft=ohome";
    @Before

    public void setup(){
        openBrowser(baseUrl);
    }
    @Test

    public void selParentChildfMethod() {

        // Self

//        List<WebElement> LWE = driver.findElements(By.xpath("//div[@class = 'passWord labelIcon']/self::div"));
//        System.out.println("Size is: "+LWE.size());
//
//        for(WebElement w:LWE)
//        {
//            System.out.println("Tag Name: "+w.getTagName());
//            System.out.println("Attribute Name: "+w.getAttribute("class"));
//        }

        // Parent
//        List<WebElement> LWE = driver.findElements(By.xpath("//div[@class = 'passWord labelIcon']/parent::*"));
//        System.out.println("Size is: "+LWE.size());
//
//        for(WebElement w:LWE)
//        {
//            System.out.println("Tag Name: "+w.getTagName());
//            System.out.println("Attribute Name: "+w.getAttribute("class"));
//        }

        // self and parent have only node but child can have multiple nodes

        // Child   ( child will only return direct child and not any grand child )

        List<WebElement> LWE = driver.findElements(By.xpath("//div[@class = 'passWord labelIcon']/child::*"));
        System.out.println("Size is: " + LWE.size());

        for (WebElement w : LWE) {
            System.out.println("Tag Name: " + w.getTagName());
            System.out.println("Attribute Name: " + w.getAttribute("class"));
        }

    }

    @After
    public void tearDown(){
        //  closeBrowser();
    }
}