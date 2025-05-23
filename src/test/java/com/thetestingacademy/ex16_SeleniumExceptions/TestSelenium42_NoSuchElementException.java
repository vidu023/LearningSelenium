package com.thetestingacademy.ex16_SeleniumExceptions;

import com.thetestingacademy.CommonBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

public class TestSelenium42_NoSuchElementException extends CommonBaseClass {

    @Test
    public void test_selenium_exceptions() {

        driver.get("https://app.vwo.com/");
        System.out.println("Start of program");
        try {
            driver.findElement(By.id("vidya")); // org.openqa.selenium.NoSuchElementException: no such element
        } catch (NoSuchElementException e) {
            System.out.println("Element Not Found");
        }


    }


}
