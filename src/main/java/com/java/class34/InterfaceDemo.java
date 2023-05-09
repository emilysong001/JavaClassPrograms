package com.java.class34;

import java.util.Scanner;

interface Browser {
    void openBrowser();
    void viewHistory();
    void openURL();
}

interface MobileBrowser extends Browser {
    void shareURLViaWhatsApp();
    void rotate();
}

interface WebBrowser extends Browser {
    void inspectElement();
    void printPage();
}

class ChromeWeb implements WebBrowser {
    @Override
    public void openBrowser() {
        System.out.println("Chrome Web Open Browser");
    }

    @Override
    public void viewHistory() {

    }

    @Override
    public void openURL() {

    }

    @Override
    public void inspectElement() {

    }

    @Override
    public void printPage() {

    }
}

class FirefoxWeb implements WebBrowser{

    @Override
    public void openBrowser() {

    }

    @Override
    public void viewHistory() {

    }

    @Override
    public void openURL() {

    }

    @Override
    public void inspectElement() {

    }

    @Override
    public void printPage() {

    }
}

class ChromeMobile implements MobileBrowser{

    @Override
    public void openBrowser() {

    }

    @Override
    public void viewHistory() {

    }

    @Override
    public void openURL() {

    }

    @Override
    public void shareURLViaWhatsApp() {

    }

    @Override
    public void rotate() {

    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        System.out.println("Please enter your browser");
        Scanner input = new Scanner(System.in);
        String browserFromUser  = input.nextLine();

        /*if (browserFromUser.contains("Mobile")){
            ChromeMobile mobile = new ChromeMobile();
            mobile.openBrowser();
            mobile.openURL();
            mobile.rotate();
            mobile.viewHistory();
            mobile.shareURLViaWhatsApp();
        }*/
        Browser browser = null;

        if (browserFromUser.contains("Mobile")) {
            browser = new ChromeMobile();
        } else if (browserFromUser.contains("Web")) {
            if (browserFromUser.contains("Chrome")) {
                browser = new ChromeWeb();
            } else {
                browser = new FirefoxWeb();
            }
        }
        browser.openBrowser();
        browser.openURL();
        browser.viewHistory();
    }
}
