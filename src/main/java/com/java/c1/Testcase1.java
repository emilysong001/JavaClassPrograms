package com.java.c1;


import com.sun.deploy.net.protocol.chrome.ChromeURLConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Testcase1 {
    public static void main(String[] args) {
        //SeleniumManager off (Beta phase) not stable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\xuanx\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //firefox geckodriver
        //webdriver.gecko.driver
        //Edge
        //driver.get("https://devxschool.com/sdet/");
        driver.get("https://devxschool.com/sdet");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        //driver.findElement(By.id("user_login")).sendKeys("Emily");
        //If you want to type anything - sendKeys
        // click
        //getText
        //verify the error message
        //before get the message, need to use wait
        //implicit wait - 5 seconds time out

        //console - $('') - $('css selector') - $('p.error')
        //console - $x('') - $x('xpath') - $x('//input[@placeholder="Name"]')
        //between '', if xpath has '', we use ""
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.close();
        driver.quit();//all associated window will be closed

        //<input type="text" name="log" id="user_login" value="" fdprocessedid="fsv4c">
        // input - tag name
        //type - attribute
        //text - attribute associated value

        //css selector syntax
        //class name -> tagname.classname / .classname
        //id ->tagname#id ->input#user_login
        // tagname[attribute='value']
        //if there are multiple elements showed up,
        // using tagname[attribute='value']:nth-child(2) 2-index - child element




        //xpath syntax
        // //tagname[@attribute='value']
        //if there are multiple elements showed up, using //tagname[@attribute='value'][2]


        //from parent to child
        //tag names
        //<h2> forgot password</h2> not a link, only a text, we use tag names
        // xpath //parenttagname/childtagname[index]
        //css //parenttagname childtagname
        //selectorhub help to find if it is unique id/name


    }
}
