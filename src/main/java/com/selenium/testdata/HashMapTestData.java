package com.selenium.testdata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.HashMap;
import java.util.Map;

public class HashMapTestData {
    public static void main(String[] args) {
        // set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // create a HashMap to store test data
        Map<String, String> testData = new HashMap<>();
        testData.put("username", "testuser");
        testData.put("password", "testpass");

        // navigate to the login page
        driver.get("http://example.com/login");

        // enter the username and password from the HashMap
        driver.findElement(By.id("username")).sendKeys(testData.get("username"));
        driver.findElement(By.id("password")).sendKeys(testData.get("password"));

        // submit the login form
        driver.findElement(By.id("loginButton")).click();

        // verify that the user is logged in
        String welcomeMessage = driver.findElement(By.id("welcomeMessage")).getText();
        Assert.assertEquals("Welcome, " + testData.get("username") + "!", welcomeMessage);

        // close the browser
        driver.quit();
    }
}
