package com.java.class33;

import org.openqa.selenium.WebDriver;

public class HomePage extends Page{

    private static final String PAGE_TITLE = "My App Home";
    private static final String PAGE_URL = "http://www.myapp.com/";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public String getPageUrl() {
        return driver.getCurrentUrl();
    }

    public boolean isAt() {
        return getPageTitle().equals(PAGE_TITLE) && getPageUrl().equals(PAGE_URL);
    }

    public LoginPage clickLoginButton() {
        // Code to click on the login button and return the LoginPage
        return null;
    }
}
