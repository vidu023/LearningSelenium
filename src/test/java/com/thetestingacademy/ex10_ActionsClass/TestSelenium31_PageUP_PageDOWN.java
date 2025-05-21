package com.thetestingacademy.ex10_ActionsClass;

import com.thetestingacademy.CommonBaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestSelenium31_PageUP_PageDOWN extends CommonBaseClass {

    @Test
    public void test_pageUp_pageDown(){

        driver.get("https://thetestingacademy.com/");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_UP).build().perform();

       // how to scroll the page up & down completely?

    }
}
