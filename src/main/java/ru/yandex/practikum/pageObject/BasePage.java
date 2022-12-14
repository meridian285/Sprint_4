package ru.yandex.practikum.pageObject;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    protected final WebDriver driver;
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
}
