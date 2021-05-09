package com.example.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {
    protected final String url = "https://www.epam.com/";

    private Actions actions = new Actions(webDriver);

    @FindBy(xpath = "//button[contains(@class,'location-selector__button')][contains(text(),'Global (EN)')]")
    public static WebElement LANGUAGE_BUTTON;

    @FindBy(xpath = "//a[contains(@href, 'https://careers.epam.hu')]")
    public static WebElement HUNGARY_BUTTON;

    @FindBy(xpath = "//a[contains(@href, 'https://www.epam.com/about/who-we-are/contact')]")
    public static WebElement CONTACT_US_BUTTON;

    @FindBy(xpath = "//a[contains(@href, '/services/consult-and-design')]")
    public static WebElement CONSULT_BUTTON;

    @FindBy(xpath = "//a[contains(@href, '/about')][contains(text(),'About')]")
    public static WebElement ABOUT_BUTTON;

    @FindBy(xpath = "//button[contains(@class, 'header-search__button header__icon')]")
    public static WebElement SEARCH_BUTTON;

    @FindBy(xpath = "//button[contains(@class, 'button-ui bg-color-light-blue cookie-disclaimer__button')]")
    public static WebElement ACCEPT_COOKIES_BUTTON;

    @FindBy(xpath = "//a[contains(@href, 'https://www.linkedin.com/company/epam-systems/')]")
    public static WebElement LINKEDIN_BUTTON;

    @FindBy(xpath = "//a[contains(@href, 'https://twitter.com/EPAMSYSTEMS')]")
    public static WebElement TWITTER_BUTTON;

    @FindBy(xpath = "//a[contains(@href, 'https://www.facebook.com/EPAM.Global')]")
    public static WebElement FACEBOOK_BUTTON;

    @FindBy(xpath = "//a[contains(@href, 'https://www.instagram.com/epamsystems')]")
    public static WebElement INSTAGRAM_BUTTON;

    @FindBy(xpath = "//a[contains(@href, 'https://www.epam.com/')]")
    public static WebElement HOME_BUTTON;

    @FindBy(id = "new_form_search")
    public WebElement FIELD_FOR_SEARCH;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void hoverButton(WebElement webElement) {
        actions.moveToElement(webElement).click().perform();
    }

    public void enterText(String text) {
        FIELD_FOR_SEARCH.sendKeys(text);
    }

    public void submitEnteredText() {
        FIELD_FOR_SEARCH.submit();
    }
}
