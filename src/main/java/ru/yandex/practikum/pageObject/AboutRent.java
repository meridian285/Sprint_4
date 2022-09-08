package ru.yandex.practikum.pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.yandex.practikum.pageObject.BasePage;

public class AboutRent extends BasePage {
    public AboutRent(WebDriver driver){
        super(driver);
    }
    private By locatorForChekLoad = By.xpath("//div[@class='Order_Header__BZXOb']");
    private By dateField = By.xpath("//input[@placeholder='* Когда привезти самокат']");
    private By selectDateDelivery = By.xpath("//div[@class='react-datepicker__day react-datepicker__day--016']");
    private By rentPeriodField = By.xpath("//div[@class='Dropdown-placeholder']");
    private By selectPeriodDay = By.xpath("//div[text()='семеро суток']");
    private By checkBoxBlack = By.id("black");
    private By commentField = By.xpath("//input[@placeholder='Комментарий для курьера']");
    private By orderButton = By.xpath("//*[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    private By buttonYes = By.xpath("//button[text()='Да']");
    //private By checkStatusButton = By.xpath("//button[text()='Посмотреть статус']");
    private By locatorForAssert = By.xpath("//div[@class='Order_ModalHeader__3FDaJ']");

    public void checkLoadPage() {
        driver.findElement(locatorForChekLoad).isDisplayed();
    }

    public void clickDateDeliveryField() {
        driver.findElement(dateField).click();
    }

    public void selectDataDelivery() {
        driver.findElement(selectDateDelivery).click();
    }
    public void clickOnTheRentPeiodField() {
        driver.findElement(rentPeriodField).click();
    }

    public void selectPeriodRent() {
        driver.findElement(selectPeriodDay).click();
    }

    public void clickOnTheCheckBoxBlack() {
        driver.findElement(checkBoxBlack).click();
    }

    public void inputComment() {
        driver.findElement(commentField).sendKeys("Быстрее пожалуйста");
    }

    public void clickOnTheOrderButton() {
        driver.findElement(orderButton).click();
    }

    public void clickYesButton() {
        driver.findElement(buttonYes).click();
    }

    public boolean isDisplay() {
        return driver.findElement(locatorForAssert).isDisplayed();
    }


}
