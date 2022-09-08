package ru.yandex.practikum.pageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage extends ru.yandex.practikum.pageObject.BasePage {
    public OrderPage(WebDriver driver){
        super(driver);
    }
    private By nameCustomerField = By.xpath("//input[@placeholder='* Имя']");
    private By surnameCustomerField = By.xpath("//input[@placeholder='* Фамилия']");
    private By addressCustomerField = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");
    private By stationMetroList = By.xpath("//input[@placeholder='* Станция метро']");
    private By selectMetroStationSokolniki = By.xpath("//div[@class='select-search__select']//*[text()='Сокольники']");
    private By selectMetroStationCherkiz = By.xpath("//div[@class='select-search__select']//*[text()='Черкизовская']");
    private By phoneNumberField = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");
    private By buttonNext = By.xpath("//*[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    public void checkLoadPage() {
        driver.findElement(nameCustomerField).isDisplayed();
    }

    public void clickOnTheStationMenu() {
        driver.findElement(stationMetroList).click();
    }
    public void inputStationMetroSokolniki() {
        driver.findElement(selectMetroStationSokolniki).click();
    }
    public void inputStationMetroLubanka() {
        driver.findElement(selectMetroStationCherkiz).click();
    }
    public void inputPhoneNumber(String inputPhoneNumber) {
        driver.findElement(phoneNumberField).sendKeys(inputPhoneNumber);
    }
    public void clickOnTheButtonNext() {
        driver.findElement(buttonNext).click();
    }

    public void inputNameAlex() {
        driver.findElement(nameCustomerField).sendKeys("Александр");
    }

    public void inputNamePetya() {
        driver.findElement(nameCustomerField).sendKeys("Петя");
    }

    public void inputSurnamePetrov() {
        driver.findElement(surnameCustomerField).sendKeys("Петров");
    }

    public void inputSurnameSidorov() {
        driver.findElement(surnameCustomerField).sendKeys("Сидоров");
    }

    public void inputAddressCustomerMoscow() {
        driver.findElement(addressCustomerField).sendKeys("г.Москва");
    }
    public void inputAddressCustomerSamara() {
        driver.findElement(addressCustomerField).sendKeys("г.Самара");
    }

    public void inputPhoneNumber1() {
        driver.findElement(phoneNumberField).sendKeys("99999999999");
    }
    public void inputPhoneNumber2() {
        driver.findElement(phoneNumberField).sendKeys("88888888888");
    }
}
