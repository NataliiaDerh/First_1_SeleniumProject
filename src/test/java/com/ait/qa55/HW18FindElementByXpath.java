package com.ait.qa55;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HW18FindElementByXpath {
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
        //className -> //*[@class='value']
        driver.findElement(By.xpath("//div[@class='master-wrapper-page']"));
        //id -> xpath - //*[@id='value']
        driver.findElement(By.xpath("//div[@id='bar-notification']"));
        //equal -> //*[text()='Text'] - поиск по точному совпадению
        driver.findElement(By.xpath("//a[.='Wishlist']"));
        //parent
        driver.findElement(By.xpath("//div[@class='footer']/parent::*"));
        //ancestor
        driver.findElement(By.xpath("//strong/ancestor::div[8]"));
        //preceding -sibling
        driver.findElement(By.xpath("//ul/preceding-sibling::div[4]"));

    }
}
