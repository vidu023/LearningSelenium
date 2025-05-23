package com.thetestingacademy.ex15_RelativeLocators;

import com.thetestingacademy.CommonBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class TestSelenium39_RelativeLocatorEg1 extends CommonBaseClass {

    @Test
    public void test_RelativeLocator1(){

        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();

        WebElement yearsOfExp = driver.findElement(By.xpath("//span[@text() = \"Years of Experience\"]"));
        driver.findElement((with(By.id("exp-2")).toRightOf(yearsOfExp))).click();
        // go reverse -> Find the element By.id exp-2 who is to right of  and click
    }
}
