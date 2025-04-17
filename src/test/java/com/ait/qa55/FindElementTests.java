//LESSON 14 Fri 04/04/2025
//LESSON 14 Fri 04/04/2025
//LESSON 14 Fri 04/04/2025

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

public class FindElementTests {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://ilcarro.web.app/search");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void findElementByTagName() {
        WebElement element = driver.findElement(By.tagName("h1"));
        System.out.println(element.getText());

        WebElement element1 = driver.findElement(By.tagName("a"));
        System.out.println(element1.getText());

        List<WebElement> elements = driver.findElements(By.tagName("a"));
        System.out.println(elements.size()); //выведет размер списка
    }

    @Test
    public void findElementBySimpleLocators() {
        // by id
        driver.findElement(By.id("city"));

        // by className
        driver.findElement(By.className("header"));
        System.out.println(driver.findElement(By.className("header")).getText());



        // LESSON 15 Mon 04/07/2025
        // LESSON 15
        // LESSON 15


        //by linkText   особой пользы в этом локаторе нет, но знать нужно)))
        driver.findElement(By.linkText("Let the car work"));
        System.out.println();

        //by partialLinkText
        driver.findElement(By.partialLinkText("car"));
    }

    @Test
    public void findElementByCssSelector() {

        //tagName == css
        //driver.findElement(By.tagName("h1"));
        driver.findElement(By.cssSelector("h1"));

        //id -> css(#)
        //driver.findElement(By.id("city"));
        driver.findElement(By.cssSelector("#city"));

        //by className -> css(.)
        //driver.findElement(By.className("header"));
        driver.findElement(By.cssSelector(".header"));


        //БОЛЕЕ СЛОЖНЫЕ ВАРИАНТЫ ПОИСКА

        // [attr='value']  - используют для поиска точного совпадения
        driver.findElement(By.cssSelector("[href='/registration?url=%2Fsearch']"));

        //contains -> *  - поиск - содержит - по частичному содержанию
        driver.findElement(By.cssSelector("[href*='/registration']"));

        //start -> ^  - ищи в начале
        driver.findElement(By.cssSelector("[href^='/reg']"));

        //end on -> $  -  ищи в конце
        driver.findElement(By.cssSelector("[href$='search']"));

        //LESSON 16
        //LESSON 16 Tuesday 04/08/25 установка плагина SelectorsHub с 2:42:00
        //LESSON 16

        //LESSON 17 Wednesday 04/09/25
        //LESSON 17
        //LESSON 17

        //tag+id
        driver.findElement(By.cssSelector("input#city"));

        //tag+class
        driver.findElement(By.cssSelector("div.search-card"));
        driver.findElement(By.cssSelector("div.mobile-header"));

        //tag+id+[attr='value'] внутри тега - между одним открывающим и закрывающим тегом
        driver.findElement(By.cssSelector("input#city[type='text']"));
    }

    //     //*[@attr='value']
    @Test
    public void findElementByXpath() {

        //id -> xpath - //*[@id='value']
        //driver.findElement(By.id("city"));
        //driver.findElement(By.cssSelector("#city"));
        driver.findElement(By.xpath("//input[@id='city']"));

        //tag -> xpath - //tag
        //driver.findElement(By.tagName("h1"));
        //driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.xpath("//h1"));

        //className -> //*[@class='value']
        //driver.findElement(By.className("header"));
        //driver.findElement(By.cssSelector(".header"));
        driver.findElement(By.xpath("//div[@class='header']"));// xxxxxxx

        //contains -> //*[contains(.,'Text')] - поиск по частичному совпадению
        //лучше не использовать в много язычной аппликации
        driver.findElement(By.xpath("//h2[contains(.,'Yalla')]"));

        //equal -> //*[text()='Text'] - поиск по точному совпадению
        driver.findElement(By.xpath("//h2[text()='Type your data and hit Yalla!']"));
        driver.findElement(By.xpath("//h2[.='Type your data and hit Yalla!']"));

        //start-with -> //*[starts-with(@attr,'StartText')]
        driver.findElement(By.xpath("//label[starts-with(@for,'ci')]"));

        //move up  -  двигаться вверх
        driver.findElement(By.xpath("//a[@class='navigation-link']")); // находит 5 элементов
        driver.findElement(By.xpath("//a[@class='navigation-link']/..")); // при добавлении в конце
                                                               // символов /..  находит родителя этих 5 элементов

        //parent
        driver.findElement(By.xpath("//h1/parent::*")); // находит родителя у тэга h1 * - любой элемент
        driver.findElement(By.xpath("//h1/parent::div")); // находит родителя у тэга h1 конкретный div
        driver.findElement(By.xpath("//h1/..")); // более короткая запись - находит родителя у тэга h1

        //ancestor
        driver.findElement(By.xpath("//h1/ancestor::*")); // находит ВСЕХ предков у тэга h1, их 7
        driver.findElement(By.xpath("//h1/ancestor::div")); // находит только предков div-ов у тэга h1, их 2
        driver.findElement(By.xpath("//h1/ancestor::div[2]")); // находит предка div-а у тэга h1,
                                                                             // под номером 2 и он в единственном экземпляре

        //following-sibling
        driver.findElement(By.xpath("//h1/following-sibling::*")); // найдет ВСЕХ последующих братьев-сестер
        driver.findElement(By.xpath("//h1/following-sibling::h2")); // найдет конкретного брата-сестру h2
        driver.findElement(By.xpath("//h1/following-sibling::form")); // найдет конкретного брата-сестру form


        //LESSON 18 Thursday 04/10/25
        //preceding -sibling
        driver.findElement(By.xpath("//h2/preceding-sibling::*"));
    }
}
