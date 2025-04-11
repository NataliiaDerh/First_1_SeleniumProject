package com.ait.qa55;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HW14FindElementDemoWebShopTest {
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
    public void findElementBySimpleLocator() {
        WebElement element = driver.findElement(By.id("mob-menu-button"));
        System.out.println(element.getText());

        WebElement element1 = driver.findElement(By.id("ui-id-1"));
        System.out.println(element1.getText());

        WebElement element2 = driver.findElement(By.id("bar-notification"));
        System.out.println(element2.getText());

        WebElement element3 = driver.findElement(By.className("close"));
        System.out.println(element3.getText());

        WebElement element4 = driver.findElement(By.className("mob-top-menu"));
        System.out.println(element4.getText());

        WebElement element5 = driver.findElement(By.className("header-menu"));
        System.out.println(element5.getText());

        WebElement element6 = driver.findElement(By.name("description"));
        System.out.println(element6.getText());

        WebElement element7 = driver.findElement(By.name("keywords"));
        System.out.println(element7.getText());

        WebElement element8 = driver.findElement(By.name("generator"));
        System.out.println(element8.getText());

        WebElement element9 = driver.findElement(By.tagName("script"));
        System.out.println(element9.getText());

        WebElement element10 = driver.findElement(By.tagName("ul"));
        System.out.println(element10.getText());
    }
}
