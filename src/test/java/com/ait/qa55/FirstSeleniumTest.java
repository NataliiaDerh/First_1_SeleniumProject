//LESSON 13 Thu 04/03/2025
//LESSON 14 Fri 04/04/2025
package com.ait.qa55;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstSeleniumTest {

    WebDriver driver;

    // before method - setUp
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        //driver.get("https://www.google.com"); // в работе использовать эту команду
                                              // прописываем адрес, который хотим открыть
                                              // эта команда открывает окно без истории,
                                              // т.е. без плагинов и настроек
        driver.navigate().to("https://seferisrael.co.il"); //.navigate().to открывается с историей
                                                               // в "" прописываем адрес, который хотим открыть
        driver.manage().window().maximize(); // страница открывается на всё окно
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // чтобы загрузились
                                                                           // все элементы на сайте перед началом теста


        // необязательные команды
        //driver.navigate().to("https://www.google.com");
        //driver.navigate().back();
        //driver.navigate().refresh(); // перезагрузка текущей страницы
    }

    @Test
    public void openGoogleTest() { // test - короткое, но понятное название теста
        System.out.println("Hello!");
    }


//CONSULTATION 06 Thu 04/03/2025
    
    // after method - tearDown
    @AfterMethod(enabled = false)
    public void tearDown() {
        driver.quit(); // закрывает полностью все страницы и браузер
        // driver.close();  // закрывает только текущую страницу
    }
}
