package ru.yandex.practikum.pageObjectTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.html5.WebStorage;


import java.lang.module.Configuration;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public abstract class BaseTest {
    protected static WebDriver driver;


    @BeforeClass
    public static void startBeforeEveryTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //WebDriverManager.firefoxdriver().setup();
        //driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }
    @After
    public void clearDate(){
        driver.manage().deleteAllCookies();
        ((WebStorage) driver).getLocalStorage().clear();
        ((WebStorage) driver).getSessionStorage().clear();
    }
    @AfterClass
    public static void tearDown(){

        driver.quit();
    }
}
