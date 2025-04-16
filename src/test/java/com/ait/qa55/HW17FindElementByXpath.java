package com.ait.qa55;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HW17FindElementByXpath {
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
    public void findElementByXpath() {
        driver.findElements(By.xpath("//h1"));

        //className -> //*[@class='value']
        driver.findElement(By.xpath("//div[@class='header']"));

        //equal -> //*[text()='Text'] - поиск по точному совпадению
        driver.findElement(By.xpath("//a[.='Log in']"));

        //id -> xpath - //*[@id='value']
        driver.findElement(By.xpath("//div[@id='flyout-cart']"));

        //contains -> //*[contains(.,'Text')] - поиск по частичному совпадению
        driver.findElement(By.xpath("//li/a[contains(.,'Fac')]"));

        //parent
        driver.findElement(By.xpath("//h3/../.."));
        driver.findElement(By.xpath("//ul[@class='top-menu']/parent::*"));

        //ancestor
        driver.findElement(By.xpath("//h3/ancestor::div[4]"));

        //following-sibling
        driver.findElement(By.xpath("//script/following-sibling::div[2]"));
        driver.findElement(By.xpath("//div[@class='header']//li/following-sibling::li[3]"));
   }

}
