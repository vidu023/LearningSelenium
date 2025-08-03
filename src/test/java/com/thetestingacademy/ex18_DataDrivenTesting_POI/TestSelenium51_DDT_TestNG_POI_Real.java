package com.thetestingacademy.ex18_DataDrivenTesting_POI;

import com.thetestingacademy.CommonBaseClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestSelenium51_DDT_TestNG_POI_Real extends CommonBaseClass {

    //provide this data i.e. function to the test
    @Test(dataProvider = "getData")
    //pass the parameters here -> email & password
    public void test_vwo_login(String email, String password) {

        //basically it will match with your parameters and give you this.
        System.out.println(email + " - " + password);

        // String[] data = password.split("_");
        // if we need to show 3rd column in the excel sheet - & if 2nd column is the password
        // header would be password_errorMsg (2 different things password & errorMessage
        // it is advisable to use data driven max to 2 columns

        // Here we will write te code to Login
    }

    @DataProvider
    //pre made function -> 2 dimensional array
    public Object[][] getData() {
        // READ THE DATA FROM THE EXCEL FILE
        // GIVE THEM IN THE 2D ARRAY
        return UtilExcel.getTestDataFromExcel("sheet1");
        // create a UtilExcel file with getTestDataFromExcel() which takes 2D data
    }


}
