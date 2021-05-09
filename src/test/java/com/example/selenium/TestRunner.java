package com.example.selenium;

import com.example.selenium.pages.AboutPage;
import com.example.selenium.pages.CareerPage;
import com.example.selenium.pages.MainPage;
import com.example.selenium.pages.SearchPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class TestRunner {
    private WebDriver webDriver;
    private MainPage mainPage;
    private AboutPage aboutPage;
    private SearchPage searchPage;
    private CareerPage careerPage;

    @Before
    public void start() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        mainPage = PageFactory.initElements(webDriver, MainPage.class);
        aboutPage = PageFactory.initElements(webDriver, AboutPage.class);
        searchPage = PageFactory.initElements(webDriver, SearchPage.class);
        careerPage = PageFactory.initElements(webDriver, CareerPage.class);
    }

    @Given("I am on epam.com")
    public void openMain() {
        mainPage.goTo();
    }

    @When("I click on language button")
    public void clickOnLanguageButton() {
        mainPage.click(MainPage.LANGUAGE_BUTTON);
    }

    @When("I click on Hungary")
    public void clickOnHungary() {
        mainPage.click(MainPage.HUNGARY_BUTTON);
    }

    @Then("I should be redirected on {string}")
    public void redirectedOn(String link) throws InterruptedException {
        mainPage.proveIfThisPageIsTheSameWithLink(link);
    }

    @When("I click on search button in the left top corner")
    public void clickOnSearchButtonInLeftTopCorner() {
        mainPage.click(MainPage.SEARCH_BUTTON);
    }

    @When("I write a word or a sentence in form")
    public void writeSentence() {
        mainPage.enterText("qwerty");
    }

    @When("click on FIND button to the left on form")
    public void submitEnteredText() {
        mainPage.submitEnteredText();
    }

    @Then("I should be redirected to the page with search results")
    public void seePageWithSearchResults() {
        searchPage.proveIfThisPageIsTheSameWithLink("https://www.epam.com/search?q=qwerty");
    }

    @Then("I should be redirected to the page with results")
    public void seePageWithResults() {
        searchPage.proveIfThisPageIsTheSameWithLink("https://www.epam.com/careers/job-listings?recruitingUrl=%2Fcontent%2Fepam%2Fen%2Fcareers%2Fjob-listings%2Fjob&country=Ukraine&sort=relevance&searchType=placeOfWorkFilter");
    }

    @When("I click on Contact Us button")
    public void clickOnContactUsButton() {
        mainPage.click(MainPage.CONTACT_US_BUTTON);
    }

    @Then("The page with a form appears")
    public void openPageWithForm() {
        careerPage.proveIfThisPageIsTheSameWithLink("https://www.epam.com/about/who-we-are/contact");
    }

    @Given("I am on www.epam.com careers")
    public void openMainPage() {
        careerPage.goTo();
    }

    @When("I choose only opened to relocation")
    public void chooseOpenToRelocation() {
        careerPage.chooseOpenToRelocation();
    }

    @When("I tap on FIND")
    public void tapOnFind() {
        careerPage.submitEnteredText();
    }

    @When("I tap on button ok to accept cookies")
    public void tapOnButtonOkToAcceptCookies() {
        mainPage.click(MainPage.ACCEPT_COOKIES_BUTTON);
    }

    @Then("I am staying on epam.com")
    public void stayOnEpamCom() {
        mainPage.proveIfThisPageIsTheSameWithLink("https://www.epam.com/");
    }

    @When("I tap on button About in header")
    public void tapOnButtonAboutInHeader() {
        mainPage.click(MainPage.ABOUT_BUTTON);
    }

    @When("I tap on {string}")
    public void tapOn(String socialNetwork) {
        switch (socialNetwork) {
            case "Instagram":
                mainPage.click(MainPage.INSTAGRAM_BUTTON);
                break;
            case "Twitter":
                mainPage.click(MainPage.TWITTER_BUTTON);
                break;
            case "Facebook":
                mainPage.click(MainPage.FACEBOOK_BUTTON);
                break;
            case "LinkedIn":
                mainPage.click(MainPage.LINKEDIN_BUTTON);
                break;
        }
    }

    @Then("I will be redirected in new tab {string}")
    public void redirectedInNewTabOn(String link) {
        mainPage.proveIfThisPageIsTheSameWithLink(link);
    }

    @When("I tap on main epam button")
    public void tapOnMainEpamButton() {
        mainPage.click(MainPage.HOME_BUTTON);
    }
}
