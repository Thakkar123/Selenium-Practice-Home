package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LocatorDemo5Axes extends BaseTest {

    String baseUrl = "https://money.rediff.com/gainers/bse/daily/groupa";

    @Before
    public void setUp()
    {
        openBrowser(baseUrl);
    }

    @Test
    public void locatorDemo5Axes()
    {
       // Self - select the current node
        String text = driver.findElement(By.xpath("//a[contains(text(),'TCI Ltd.')]/self::a")).getText();
        System.out.println(text); // TCI Ltd

        //Parent - select the parent of current node( it always one)

        text = driver.findElement(By.xpath("//a[contains(text(),'TCI Ltd.')]/parent::td")).getText();
        System.out.println(text); // TCI Ltd

        // Child - select all the direct children and not grand children

        List<WebElement> childrens = driver.findElements(By.xpath("//a[contains(text(),'TCI Ltd.')]/ancestor::tr/child::td"));
        System.out.println("Number of child elements: "+childrens.size());    // Number of child elements: 5

        //Ancestor - select all the Ancestors of current node ( Parent and all grand parents )

        text = driver.findElement(By.xpath("//a[contains(text(),'TCI Ltd.')]/ancestor::tr")).getText();
        System.out.println(text); // TCI Ltd. A 696.20 739.00 + 6.15

        //Descendant - select all the descendants of current node ( children and grand children )
        List<WebElement> descendants = driver.findElements(By.xpath("//a[contains(text(),'TCI Ltd.')]/ancestor::tr/descendant::*"));
        System.out.println("Number of descendants: "+descendants.size());    // Number of child descendants: 7

        // Following - select everything after the closing tag of current node
        List<WebElement> following = driver.findElements(By.xpath("//a[contains(text(),'TCI Ltd.')]/ancestor::tr/following::tr"));
        System.out.println("Number of following: "+following.size());  // Number of following: 208

        // Following-sibling - select all the sibling after the current node

        //a[contains(text(),'TCI Ltd.')]/ancestor::tr/following-sibling::tr


        // Preceding  - select all nodes appear before the current node in the document

        //a[contains(text(),'TCI Ltd.')]/ancestor::tr/preceding::tr

        // Preceding-sibling - select all the siblings before the current node

        //a[contains(text(),'TCI Ltd.')]/ancestor::tr/preceding-sibling::tr

    }

    @After
    public void tearDown()
    {
        //closeBrowser();
    }
}
