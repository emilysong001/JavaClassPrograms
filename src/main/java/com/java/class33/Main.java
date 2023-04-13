package com.java.class33;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        Page p= new HomePage(driver);
        System.out.println(p.getPageTitle());
        System.out.println(p.getPageUrl());

    }
}
