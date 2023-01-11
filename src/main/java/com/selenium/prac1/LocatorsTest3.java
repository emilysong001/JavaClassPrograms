package com.selenium.prac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LocatorsTest3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\xuanx\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://devxschool.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        //(//a[contains(text(),'View Patient Clinical Information')])[1]
        driver.findElement(By.xpath("(//a[contains(text(),'Log in')])[1]")).click();

    }
}
