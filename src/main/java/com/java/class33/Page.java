package com.java.class33;


import org.openqa.selenium.WebDriver;

public abstract class Page {
    protected WebDriver driver;

    public Page(WebDriver driver) {
        this.driver = driver;
    }

    public abstract String getPageTitle();

    public abstract String getPageUrl();

    public abstract boolean isAt();
}
