package com.thetestingacademy.ex13_JavascriptEx;

import com.thetestingacademy.CommonBaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TestSelenium36_InterviewQnA extends CommonBaseClass {

    @Test
    public void test_newWindow(){

        // Interview Question - ZETA Company - you need to navigate to another URL without using,
        // driver.get or driver.navigate command
        // by using javascript executor

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.location = 'https://www.google.com'");

    }
}
