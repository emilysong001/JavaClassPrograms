package com.java.class29homework;

public class Main {
    public static void main(String[] args) {
        LoginPage lp = new LoginPage();
        lp.doLogin();
        lp.logout();
        HomePage hp = new HomePage();
        hp.openHomePage();
        hp.verifyLogo();
    }

}
