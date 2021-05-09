package com.example.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.*;

public class BasePage {
    protected final String url = "https://www.epam.com/";
    protected final WebDriver webDriver;
    protected final WebDriverWait webDriverWait;

    public BasePage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
        webDriverWait = new WebDriverWait(webDriver, 5);
    }

    public void proveIfThisPageIsTheSameWithLink(String link) {
        assertEquals(link, webDriver.getCurrentUrl());
    }

    public void click(WebElement button) {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(button));
        button.click();
    }

    public void goTo() {
        webDriver.get(url);
    }
}
