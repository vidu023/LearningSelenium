package com.thetestingacademy.ex18_DataDrivenTesting_POI;

import com.thetestingacademy.CommonBaseClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestSelenium49_DDT_TestNG_POI extends CommonBaseClass {

    //provide this data i.e. function to the test
    @Test(dataProvider = "getData")
    //pass the parameters here -> email & password
    public void test_vwo_login(String email, String password) {

        //basically it will match with your parameters and give you this.
        System.out.println(email + " - " + password);
    }

    @DataProvider
    //pre made function -> 2 dimensional array
    public Object[][] getData() {
        return new Object[][]{
                new Object[]{"admin@gmail.com", "pass123"},
                new Object[]{"admin123@gmail.com", "pass123"},
                new Object[]{"admin123@gmail.com", "pass456"},
        };
    }


}
