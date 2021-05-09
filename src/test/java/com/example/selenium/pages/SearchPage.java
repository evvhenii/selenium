package com.example.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class SearchPage extends BasePage {
    private final String url = "https://www.epam.com/search";
    private Actions actions = new Actions(webDriver);

    public SearchPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void seeSearchResultsFor(String searchSentence) {
        proveIfThisPageIsTheSameWithLink(url + "?q=" + searchSentence);
    }
}
