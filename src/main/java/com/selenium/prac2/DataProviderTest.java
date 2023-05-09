package com.selenium.prac2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class DataProviderTest {

    @DataProvider(name = "testData")
    public static Object[][] testData() {
        return new Object[][]{
                {"a", 1},
                {"b", 2},
                {"c", 3}
        };
    }

    @Factory(dataProvider = "testData")
    public Object[] createInstances(String input, int expectedOutput) {
        return new Object[]{new TestClass(input, expectedOutput)};
    }

    public class TestClass {
        private final String input;
        private final int expectedOutput;

        public TestClass(String input, int expectedOutput) {
            this.input = input;
            this.expectedOutput = expectedOutput;
        }

        @Test
        public void testMethod() {
            // test logic here
            if (input == "a") {
                System.out.println(expectedOutput);
            }
            if (input == "b") {
                System.out.println(expectedOutput);
            }
            if (input == "c") {
                System.out.println(expectedOutput);
            }
            //System.out.println(expectedOutput);
        }
    }


}
