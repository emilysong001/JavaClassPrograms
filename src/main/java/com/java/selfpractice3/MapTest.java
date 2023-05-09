package com.java.selfpractice3;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest {
    private Map<String, Object> data = new LinkedHashMap<String, Object>();
    String str = "Hello";//instant variable
    int a = 10;


    public static void main(String[] args) {
        MapTest mp = new MapTest();
        System.out.println(mp.data.get("id=_58_login").toString());
        //str.charAt(0);

    }

    @DataProvider
    public static Object[][] getTestData() throws URISyntaxException, IOException {
        Object[][] testData = null;
        boolean isSuccess = true;
        try {
            //TODO: change the "ValidationVerificationSampleTest" here to be the name of the actual test case class
            //testData = (Object[][])CsvFactory.getInstance(DSTC006HomechoiceClariaDeviceProgramVerifyIndividualFields.class).getContents();
        testData = readCSV("test.csv");
            System.out.println("testDatamethod");
            System.out.println(testData.length);

        } catch (Exception e) {
            isSuccess = false;
        }
        if (isSuccess==false || testData.length == 0) {
            return (Object[][])new String[0][0];
        } else {
            return testData;
        }
    }

    @Factory(dataProvider = "getTestData")
    public MapTest(){
        data.put("id=_58_login", "baxnh.hc+automation@gmail.com");
        data.put("id=_58_password", "BaXter123");
        data.put("id=searchCriteria", "Automation-No.DP");
        data.put("id=programmedDeviceSelector", "Homechoice Claria 1.0");
        System.out.println("constructor");
        System.out.println(data);
    }

    public void test(){
        data.put("id=_58_login", "baxnh.hc+automation@gmail.com");
    }

    public static String[][] readCSV(String fileName) {
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        String[][] data = null;
        try {
            br = new BufferedReader(new FileReader(fileName));
            int row = 0;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(cvsSplitBy);
                if (data == null) {
                    data = new String[countLines(fileName)][values.length];
                }
                for (int col = 0; col < values.length; col++) {
                    data[row][col] = values[col];
                }
                row++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return data;
    }

    private static int countLines(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        int lines = 0;
        while (reader.readLine() != null) lines++;
        reader.close();
        return lines;
    }



        }
