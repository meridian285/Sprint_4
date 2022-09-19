package ru.yandex.practikum.pageObjectTests;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.yandex.practikum.pageObject.AboutRent;
import ru.yandex.practikum.pageObject.MainPage;
import ru.yandex.practikum.pageObject.OrderPage;
@RunWith(Parameterized.class)
public class MakeOrderTests extends BaseTest {
    private final String name;
    private final String surname;
    private final String address;
    private final String stationMetro;
    private final String phoneNumber;

    public MakeOrderTests(String name, String surname, String address, String stationMetro, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.stationMetro = stationMetro;
        this.phoneNumber = phoneNumber;
    }

    @Parameterized.Parameters
    public static Object[][] getDataCustomer() {
        //Введите тестовые данные
        return new Object[][]{
                {"Александр", "Сидоров", "г.Москва", "Черкизовская", "99999999999"},
                {"Вася", "Петров", "г.Москва, ул.Какая-нибудь", "Алма-Атинская", "88888888888"},
                {"Алексей", "Робинович", "г.Москва, ул.Где-нибудь", "Щёлковская", "77777777777"},
        };
    }

    @Test
    public void placeOrderUsingButtonOnTheTop() {
        MainPage mainPage = new MainPage(driver);
        mainPage.navigate();
        mainPage.clickOnTheButtonOrderOnTheTop();
        OrderPage orderPage = new OrderPage(driver, name, surname, address, stationMetro, phoneNumber);
        orderPage.customerInformationFields(MakeOrderTests.getDataCustomer());
        orderPage.clickOnTheButtonNext();
        AboutRent aboutRent = new AboutRent(driver);
        aboutRent.selectDataDelivery();
        aboutRent.selectPeriodRent();
        aboutRent.clickOnTheCheckBoxBlack();
        aboutRent.inputComment("Быстрее пожалуйста");
        aboutRent.clickOnTheOrderButton();
        aboutRent.clickYesButton();
        Assert.assertTrue("Тест не прошел, не найдено подтверждение заказа", aboutRent.isDisplay());
    }
    @Test
    public void placeOrderUsingButtonBelow() {
        MainPage mainPage = new MainPage(driver);
        mainPage.navigate();
        mainPage.clickOnTheButtonOrderBelow();
        OrderPage orderPage = new OrderPage(driver, name, surname, address, stationMetro, phoneNumber);
        orderPage.customerInformationFields(MakeOrderTests.getDataCustomer());
        orderPage.clickOnTheButtonNext();
        AboutRent aboutRent = new AboutRent(driver);
        aboutRent.selectDataDelivery();
        aboutRent.selectPeriodRent();
        aboutRent.clickOnTheCheckBoxBlack();
        aboutRent.inputComment("Быстрее пожалуйста");
        aboutRent.clickOnTheOrderButton();
        aboutRent.clickYesButton();
        Assert.assertTrue("Тест не прошел, не найдено подтверждение заказа", aboutRent.isDisplay());
    }
}