package ru.yandex.practikum.pageObjectTests;

import org.junit.Assert;
import org.junit.Test;
import ru.yandex.practikum.pageObject.AboutRent;
import ru.yandex.practikum.pageObject.MainPage;
import ru.yandex.practikum.pageObject.OrderPage;

public class MakeOrder extends BaseTest {

    @Test
    public void placeOrderUsingButtonOnTheTop1() {
        MainPage mainPage = new MainPage(driver);
        mainPage.navigate();
        mainPage.clickOnTheButtonOrderOnTheTop();
        OrderPage orderPage = new OrderPage(driver);
        orderPage.checkLoadPage();
        orderPage.inputNameAlex();
        orderPage.inputSurnamePetrov();
        orderPage.inputAddressCustomerMoscow();
        orderPage.clickOnTheStationMenu();
        orderPage.inputStationMetroSokolniki();
        orderPage.inputPhoneNumber1();
        orderPage.clickOnTheButtonNext();
        AboutRent aboutRent = new AboutRent(driver);
        aboutRent.checkLoadPage();
        aboutRent.clickDateDeliveryField();
        aboutRent.selectDataDelivery();
        aboutRent.clickOnTheRentPeiodField();
        aboutRent.selectPeriodRent();
        aboutRent.clickOnTheCheckBoxBlack();
        aboutRent.inputComment();
        aboutRent.clickOnTheOrderButton();
        aboutRent.clickYesButton();
        Assert.assertTrue("Тест не прошел, не найден конечный элемент", aboutRent.isDisplay());

    }
    @Test
    public void placeOrderUsingButtonOnTheTop2() {
        MainPage mainPage = new MainPage(driver);
        mainPage.navigate();
        mainPage.clickOnTheButtonOrderOnTheTop();
        OrderPage orderPage = new OrderPage(driver);
        orderPage.checkLoadPage();
        orderPage.inputNamePetya();
        orderPage.inputSurnameSidorov();
        orderPage.inputAddressCustomerSamara();
        orderPage.clickOnTheStationMenu();
        orderPage.inputStationMetroLubanka();
        orderPage.inputPhoneNumber2();
        orderPage.clickOnTheButtonNext();
        AboutRent aboutRent = new AboutRent(driver);
        aboutRent.checkLoadPage();
        aboutRent.clickDateDeliveryField();
        aboutRent.selectDataDelivery();
        aboutRent.clickOnTheRentPeiodField();
        aboutRent.selectPeriodRent();
        aboutRent.clickOnTheCheckBoxBlack();
        aboutRent.inputComment();
        aboutRent.clickOnTheOrderButton();
        aboutRent.clickYesButton();
        Assert.assertTrue("Тест не прошел, не найден конечный элемент", aboutRent.isDisplay());

    }
    @Test
    public void placeOrderUsingButtonOnTheDown1() {
        MainPage mainPage = new MainPage(driver);
        mainPage.navigate();
        mainPage.clickOnTheButtonOrderOnTheDown();
        OrderPage orderPage = new OrderPage(driver);
        orderPage.checkLoadPage();
        orderPage.inputNameAlex();
        orderPage.inputSurnamePetrov();
        orderPage.inputAddressCustomerMoscow();
        orderPage.clickOnTheStationMenu();
        orderPage.inputStationMetroSokolniki();
        orderPage.inputPhoneNumber1();
        orderPage.clickOnTheButtonNext();
        AboutRent aboutRent = new AboutRent(driver);
        aboutRent.checkLoadPage();
        aboutRent.clickDateDeliveryField();
        aboutRent.selectDataDelivery();
        aboutRent.clickOnTheRentPeiodField();
        aboutRent.selectPeriodRent();
        aboutRent.clickOnTheCheckBoxBlack();
        aboutRent.inputComment();
        aboutRent.clickOnTheOrderButton();
        aboutRent.clickYesButton();
        Assert.assertTrue("Тест не прошел, не найден конечный элемент", aboutRent.isDisplay());
    }
    @Test
    public void placeOrderUsingButtonOnTheDown2() {
        MainPage mainPage = new MainPage(driver);
        mainPage.navigate();
        mainPage.clickOnTheButtonOrderOnTheDown();
        OrderPage orderPage = new OrderPage(driver);
        orderPage.checkLoadPage();
        orderPage.inputNamePetya();
        orderPage.inputSurnameSidorov();
        orderPage.inputAddressCustomerSamara();
        orderPage.clickOnTheStationMenu();
        orderPage.inputStationMetroLubanka();
        orderPage.inputPhoneNumber2();
        orderPage.clickOnTheButtonNext();
        AboutRent aboutRent = new AboutRent(driver);
        aboutRent.checkLoadPage();
        aboutRent.clickDateDeliveryField();
        aboutRent.selectDataDelivery();
        aboutRent.clickOnTheRentPeiodField();
        aboutRent.selectPeriodRent();
        aboutRent.clickOnTheCheckBoxBlack();
        aboutRent.inputComment();
        aboutRent.clickOnTheOrderButton();
        aboutRent.clickYesButton();
        Assert.assertTrue("Тест не прошел, не найден конечный элемент", aboutRent.isDisplay());

    }
}
