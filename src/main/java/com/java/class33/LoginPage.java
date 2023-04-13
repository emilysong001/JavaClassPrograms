package com.java.class33;

import org.openqa.selenium.WebDriver;

public class LoginPage extends Page{
    private static final String PAGE_TITLE = "My App Login";
    private static final String PAGE_URL = "http://www.myapp.com/login";

    public LoginPage(WebDriver driver) {
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

    public void enterCredentials(String username, String password) {
        // Code to enter the username and password into the login form
    }

    public HomePage clickLoginButton() {
        // Code to click on the login button and return the HomePage
        return null;
    }
}
