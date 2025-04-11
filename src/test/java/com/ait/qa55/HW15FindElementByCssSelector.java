package com.ait.qa55;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HW15FindElementByCssSelector {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void findElementByText() {
        WebElement element = driver.findElement(By.linkText("Apparel & Shoes"));
        System.out.println(element.getText());
        WebElement element1 = driver.findElement(By.partialLinkText("Shoes"));
        System.out.println(element1.getText());
    }

    @Test
    public void findElementByCssSelector() {
        //tagName == css
        WebElement element = driver.findElement(By.cssSelector("script"));
        System.out.println(element.getText());

        WebElement element1 = driver.findElement(By.cssSelector("ul"));
        System.out.println(element1.getText());

        //id -> css(#)
        WebElement element2 = driver.findElement(By.cssSelector("#mob-menu-button"));
        System.out.println(element2.getText());

        WebElement element3 = driver.findElement(By.cssSelector("#ui-id-1"));
        System.out.println(element3.getText());

        WebElement element4 = driver.findElement(By.cssSelector("#bar-notification"));
        System.out.println(element4.getText());

        //by className -> css(.)
        WebElement element5 = driver.findElement(By.cssSelector(".close"));
        System.out.println(element5.getText());

        WebElement element6 = driver.findElement(By.cssSelector(".header-menu"));
        System.out.println(element6.getText());

        // [attr='value']
        WebElement element7 = driver.findElement(By.cssSelector("[class='ajax-loading-block-window']"));
        System.out.println(element7.getText());

        //contains ->*
        WebElement element8 = driver.findElement(By.cssSelector("[class*='-block-']"));
        System.out.println(element8.getText());

        //start ->^
        WebElement element9 = driver.findElement(By.cssSelector("[class^='ajax']"));
        System.out.println(element9.getText());

        //end on->$
        WebElement element10 = driver.findElement(By.cssSelector("[class$='window']"));
        System.out.println(element10.getText());
    }
}
