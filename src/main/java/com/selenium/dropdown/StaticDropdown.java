package com.selenium.dropdown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticDropdown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\xuanx\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
    }
}
