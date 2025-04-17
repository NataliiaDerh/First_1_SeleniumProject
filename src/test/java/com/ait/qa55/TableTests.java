//LESSON 18 Thursday 04/10/25 time 1:29:00
//LESSON 18
//LESSON 18

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

public class TableTests {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/css/css_table.asp");
        driver.manage().window().maximize(); // открывает окно на весь экран
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // ожидание 10 сек перед закрытием
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void findElementTableWithCssTest() {
        //print number of row - распечатать количество рядов
        List<WebElement> rows = driver.findElements(By.cssSelector("tr"));
        System.out.println(rows.size());
        System.out.println("*************************");
        // print all rows  -  распечатка всех строк таблицы
        for (WebElement el : rows) {
            System.out.println(el.getText());
        }
        System.out.println("*************************");


        //get row 4  -  показать 4-ю строку таблицы
        WebElement row4 = driver.findElement(By.cssSelector("tr:nth-child(4)"));// xpath -> //tr[4]
        System.out.println(row4.getText());
        System.out.println("*************************");

        //get first item in row  -  показать 1-й элемент в 7-й строке
        WebElement item1 = driver.findElement(By.cssSelector("tr:nth-child(7) td:nth-child(1)"));
        System.out.println(item1.getText());//(By.xpath(//tr[7]/td[1])
        System.out.println("*************************");

        //get last element  -  показать последний элемент в 8-й строке
        WebElement element = driver.findElement(By.cssSelector("tr:nth-child(8) td:last-child"));
        System.out.println(element.getText());//(By.xpath(//tr[7]/td[1])
        System.out.println("*************************");
    }

}

