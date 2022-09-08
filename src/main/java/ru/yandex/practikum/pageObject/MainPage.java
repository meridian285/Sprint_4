package ru.yandex.practikum.pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class MainPage extends ru.yandex.practikum.pageObject.BasePage {
    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    public MainPage(WebDriver driver){
        super(driver);
    }
    protected By buttonOrderOnTheTop = By.xpath("//*[@class='Button_Button__ra12g']");
    protected By buttonOrderOnTheDown = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    public void navigate(){
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }

    public WebElement getClickListHeading1(){
        By heading1 = By.id("accordion__heading-0");
        scrollDownToMenu(heading1);
        wait.until(ExpectedConditions.visibilityOfElementLocated(heading1));
        return driver.findElement(heading1);
    }
    public WebElement getClickListHeading2(){
        By heading2 = By.id("accordion__heading-1");
        scrollDownToMenu(heading2);
        wait.until(ExpectedConditions.visibilityOfElementLocated(heading2));
        return driver.findElement(heading2);
    }
    public WebElement getClickListHeading3(){
        By heading3 = By.id("accordion__heading-2");
        wait.until(ExpectedConditions.visibilityOfElementLocated(heading3));
        return driver.findElement(heading3);
    }
    public WebElement getClickListHeading4(){
        By heading4 = By.id("accordion__heading-3");
        scrollDownToMenu(heading4);
        wait.until(ExpectedConditions.visibilityOfElementLocated(heading4));
        return driver.findElement(heading4);
    }
    public WebElement getClickListHeading5(){
        By heading5 = By.id("accordion__heading-4");
        scrollDownToMenu(heading5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(heading5));
        return driver.findElement(heading5);
    }
    public WebElement getClickListHeading6(){
        By heading6 = By.id("accordion__heading-5");
        scrollDownToMenu(heading6);
        wait.until(ExpectedConditions.visibilityOfElementLocated(heading6));
        return driver.findElement(heading6);
    }
    public WebElement getClickListHeading7(){
        By heading7 = By.id("accordion__heading-6");
        scrollDownToMenu(heading7);
        wait.until(ExpectedConditions.visibilityOfElementLocated(heading7));
        return driver.findElement(heading7);
    }
    public WebElement getClickListHeading8(){
        By heading8 = By.id("accordion__heading-7");
        scrollDownToMenu(heading8);
        wait.until(ExpectedConditions.visibilityOfElementLocated(heading8));
        return driver.findElement(heading8);
    }
    public String getCheckTextDropdownMenu1(){
        By checkTextDropdownMenu1 = By.xpath("//*[contains(text(),'Сутки — 400 рублей.')]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(checkTextDropdownMenu1));
        return driver.findElement(checkTextDropdownMenu1).getText();
    }
    public String getCheckTextDropdownMenu2(){
        By checkTextDropdownMenu2 = By.xpath("//*[contains(text(),'Пока что у нас так:')]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(checkTextDropdownMenu2));
        return driver.findElement(checkTextDropdownMenu2).getText();
    }
    public String getCheckTextDropdownMenu3(){
        By checkTextDropdownMenu3 = By.xpath("//*[contains(text(),'Допустим, вы оформляете заказ')]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(checkTextDropdownMenu3));
        return driver.findElement(checkTextDropdownMenu3).getText();
    }
    public String getCheckTextDropdownMenu4(){
        By checkTextDropdownMenu4 = By.xpath("//*[contains(text(),'Только начиная с завтрашнего ')]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(checkTextDropdownMenu4));
        return driver.findElement(checkTextDropdownMenu4).getText();
    }
    public String getCheckTextDropdownMenu5(){
        By checkTextDropdownMenu5 = By.xpath("//*[contains(text(),'Пока что нет! Но если что-то')]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(checkTextDropdownMenu5));
        return driver.findElement(checkTextDropdownMenu5).getText();
    }
    public String getCheckTextDropdownMenu6(){
        By checkTextDropdownMenu6 = By.xpath("//*[contains(text(),'Самокат приезжает к вам')]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(checkTextDropdownMenu6));
        return driver.findElement(checkTextDropdownMenu6).getText();
    }
    public String getCheckTextDropdownMenu7(){
        By checkTextDropdownMenu7 = By.xpath("//*[contains(text(),'Да, пока самокат')]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(checkTextDropdownMenu7));
        return driver.findElement(checkTextDropdownMenu7).getText();
    }
    public String getCheckTextDropdownMenu8(){
        By checkTextDropdownMenu8 = By.xpath("//*[contains(text(),'Да, обязательно. ')]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(checkTextDropdownMenu8));
        return driver.findElement(checkTextDropdownMenu8).getText();
    }

    public void scrollDownToMenu(By locator) {
        WebElement element = driver.findElement(locator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }
    public void clickOnTheButtonOrderOnTheTop() {
        driver.findElement(buttonOrderOnTheTop).click();
    }
    public void clickOnTheButtonOrderOnTheDown() {
        WebElement element = driver.findElement(buttonOrderOnTheDown);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(buttonOrderOnTheDown).click();
    }
}
