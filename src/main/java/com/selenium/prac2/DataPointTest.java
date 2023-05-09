package com.selenium.prac2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPointTest {
    @DataProvider(name = "testData")
    public static Object[][] testData() {
        return new Object[][] {
                {"a", 1},
                {"b", 2},
                {"c", 3}
        };
    }

    @Test(dataProvider = "testData")
    public void testMethod(String input, int expectedOutput) {
        // test logic here
        Object[][] str = testData();
        System.out.println(str[0][0]);
        System.out.println(str[0][1]);
        System.out.println(str[1][0]);
        System.out.println(str[1][1]);

    }
}
