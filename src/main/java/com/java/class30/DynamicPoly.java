package com.java.class30;

public class DynamicPoly {
    public static void main(String[] args) {
        String browser = "chrome";
        //String browser = "firefox";
        //String browser = "a";

        Browser b = null;
        if (browser.equals("chrome")){
            /*Chrome c = new Chrome();
            c.openWebsite();
            c.login();
            c.logout();*/

            /*Browser b = new Chrome();
            b.openWebsite();
            b.login();
            b.logout();*/

            b = new Chrome();
        } else if(browser.equals("firefox")){
            /*Firefox f = new Firefox();
            f.openWebsite();
            f.login();
            f.logout();*/

            /*Browser b = new Firefox();
            b.openWebsite();
            b.login();
            b.logout();*/

            b = new Firefox();
        } else {
           // System.out.println("invalid");
            throw new RuntimeException("invalid");
        }

        b.openWebsite();
        b.login();
        b.logout();

    }
}
class Browser{
    void openWebsite(){
        System.out.println("open browser");
    }
    void login(){
        System.out.println("login");
    }
    void logout(){
        System.out.println("logout");
    }
}

class Chrome extends Browser{
    void openWebsite(){
        System.out.println("open browser in Chrome");
    }
}

class Firefox extends Browser{
    void openWebsite(){
        System.out.println("open browser in Firefox");
    }
}