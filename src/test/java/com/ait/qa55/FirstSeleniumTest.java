//Lesson 13 Thu 04/03/2025
package com.ait.qa55;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest {

    WebDriver driver;

    // before method - setUp
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.google.com"); // в работе использовать эту команду
                                              // прописываем адрес, который хотим открыть
                                              // эта команда открывает окно без истории,
                                              // т.е. без плагинов и настроек
        //driver.navigate().to("https://seferisrael.co.il");//открывается с историей

        // необязательные команды
        //driver.navigate().to("https://www.google.com");
        //driver.navigate().back();
        //driver.navigate().refresh(); // перезагрузка текущей страницы
    }

    @Test
    public void openGoogleTest() { // test - короткое, но понятное название теста
        System.out.println("Hello!");
    }

//Consultation 06 Thu 04/03/2025
    // after method - tearDown
    @AfterMethod(enabled = false)
    public void tearDown() {
        driver.quit();
    }
}
