package com.selenium.prac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LocatorsTest2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\xuanx\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.indeed.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(1000);//1 second
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.id("text-input-what")).sendKeys("SDET");
        driver.findElement(By.className("yosegi-InlineWhatWhere-primaryButton")).click();

        driver.findElement(By.id("DesktopSERPJobAlert-email")).sendKeys("SDET");
        driver.findElement(By.cssSelector("input[id='DesktopSERPJobAlert-email']")).sendKeys("Emily");
        //driver.findElement(By.cssSelector("input#DesktopSERPJobAlert-email")).clear();
        driver.findElement(By.cssSelector("input#DesktopSERPJobAlert-email")).sendKeys("SDET12");


        //driver.findElement(By.name("login")).click();
        //when use explicit wait Thread.sleep(1000); //unstable //class 40
        //when use implicit wait


    }
}
