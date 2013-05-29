package com.confiz;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Waleed
 * Date: 5/29/13
 * Time: 8:53 PM
 * To change this template use File | Settings | File Templates.
 */


public class ExampleTest {


    @Test
    public void testSampleGoogle() {
        WebDriver driver = new FirefoxDriver();

        // And now use this to visit Google
        driver.get("http://www.google.com");

        // Find the text input element by its name
        WebElement element = driver.findElement(By.name("q"));

        // Enter something to search for
        element.sendKeys("Cheese!");

        // Now submit the form. WebDriver will find the form for us from the element
        element.submit();

        // Check the title of the page


        Assert.assertTrue(true, "Page title is: " + driver.getTitle());
    }

}
