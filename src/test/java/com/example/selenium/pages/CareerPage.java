package com.example.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CareerPage extends BasePage {
    protected final String url = "https://www.epam.com/careers";

    @FindBy(xpath = "//label[contains(@class, 'recruiting-search__filter-label checkbox-custom-label')]")
    public WebElement CHECK_BOX_OPEN_TO_RELOCATION;

    @FindBy(xpath = "//button[contains(@class, 'recruiting-search__submit')]")
    public static WebElement SEND_BUTTON;

    public CareerPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void seeCareersSearchResultsFor(String searchSentence) {
        proveIfThisPageIsTheSameWithLink(url + "/job-listings?query=" + searchSentence + "&country=Ukraine");
    }

    public void chooseOpenToRelocation() {
        CHECK_BOX_OPEN_TO_RELOCATION.submit();
    }

    public void submitEnteredText() {
        SEND_BUTTON.submit();
    }

    public void goTo() {
        webDriver.get(url);
    }
}
