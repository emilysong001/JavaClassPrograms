package com.selenium.prac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LocatorsTest1 {
    public static void main(String[] args) {
        //SeleniumManager off (Beta phase) not stable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\xuanx\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //firefox geckodriver
        //webdriver.gecko.driver
        //Edge
        //driver.get("https://devxschool.com/sdet/");
        driver.get("https://www.fidelity.com/");
        https://www.indeed.com/
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        //driver.findElement(By.xpath("//div[@id='js-navToggleTarget']/div[2]")).click();
        driver.findElement(By.name("login")).click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.className("fs-mask-username")).sendKeys("emily");

    }
}
