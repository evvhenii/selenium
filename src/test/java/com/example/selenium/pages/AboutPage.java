package com.example.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutPage extends BasePage {
    @FindBy(xpath = "//button[contains(@href, 'https://www.youtube.com/watch?v=feSEUmrul7A&feature=emb_imp_woyt')]")
    public static WebElement PLAY_ON_YOUTUBE_BUTTON_IN_THE_LEFT_CORNER;

    public AboutPage(WebDriver webDriver) {
        super(webDriver);
    }
}
