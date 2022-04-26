package zhomepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathOptions {

    public static void main(String[] args)  {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.rediff.com/");
        driver.manage().window().maximize();


        // syntax: htmltag[@attribute = 'value']

      //  driver.findElement(By.xpath("//a[@class='signin']")).click();  // here we have created xpath manually

        // And syntax: htmltag[@attribute = 'value' and @attribute = 'value']

        //driver.findElement(By.xpath("//input[@id ='login1' and @name ='login']")).sendKeys("abc@gmail.com");

        // Or syntax: htmltag[@attribute = 'value' or @attribute = 'value']

       //driver.findElement(By.xpath("//input[@id ='login1' or @name ='login']")).sendKeys("abc@gmail.com");

        // text() syntax:  htmltag[text() = 'valueoftext']  ----- mainly we use this for link


        driver.findElement(By.xpath("//a[text() = 'Sign in']")).click();  //  another way for line 21

        // contains syntax when we have to use text : htmltag[contains(text(),'valueoftext']
       // driver.findElement(By.xpath("//a[contains(text(),'MOVIES')]")).click();

        // contains syntax when we have to use any attribute: htmltag[contains(@attribute,'value']
        driver.findElement(By.xpath("//input[contains(@id,'login1')]")).sendKeys("abc@gmail.com");
        driver.findElement(By.xpath("//input[contains(@name,'passwd')]")).sendKeys("abc123");

        // htmltag[starts-with(@attribute,'value')]
        // htmltag[ends-with(@attribute,'value')]




    }

}
