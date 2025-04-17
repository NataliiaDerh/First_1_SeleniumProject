package com.ait.qa55;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class HW18TableTests {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/css/css_table.asp");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void findElementTableWithCssSelector() {
        System.out.println("********** cssSelector ***************");
        List<WebElement> td = driver.findElements(By.cssSelector("td:nth-child(3)"));
        System.out.println(td.size());
        System.out.println("**************************************");
        WebElement element = driver.findElement(By.cssSelector("tr:nth-child(4) td:nth-child(2)"));
        System.out.println(element.getText());
        WebElement element1 = driver.findElement(By.cssSelector("tr:nth-child(5) td:nth-child(1)"));
        System.out.println(element1.getText());
        WebElement element2 = driver.findElement(By.cssSelector("tr:nth-child(2) td:nth-child(1)"));
        System.out.println(element2.getText());
        System.out.println("**************************************");
        WebElement element3 = driver.findElement(By.cssSelector("tr:nth-child(6) td:last-child"));
        System.out.println(element3.getText());
        System.out.println("**************************************");
    }

    @Test
    public void findElementTableWithXPath() {
        System.out.println("============= xPath ==================");
        WebElement element1 = driver.findElement(By.xpath("//tr[5]"));
        System.out.println(element1.getText());
        WebElement element2 = driver.findElement(By.xpath("//tr[3]"));
        System.out.println(element2.getText());
        System.out.println("======================================");
        WebElement element3 = driver.findElement(By.xpath("//tr[4]/td[2]"));
        System.out.println(element3.getText());
        WebElement element4 = driver.findElement(By.xpath("//tr[2]/td[3]"));
        System.out.println(element4.getText());
        WebElement element5 = driver.findElement(By.xpath("//tr[6]/td[2]"));
        System.out.println(element5.getText());
        System.out.println("======================================");
        WebElement element6 = driver.findElement(By.xpath("//tr[6]/td[last()]"));
        System.out.println(element6.getText());
        WebElement element7 = driver.findElement(By.xpath("//tr[2]/td[last()]"));
        System.out.println(element7.getText());
        WebElement element8 = driver.findElement(By.xpath("//tr[8]/td[last()]"));
        System.out.println(element8.getText());
    }
}
