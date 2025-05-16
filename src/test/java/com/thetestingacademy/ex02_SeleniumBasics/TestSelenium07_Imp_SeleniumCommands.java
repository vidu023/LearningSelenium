package com.thetestingacademy.ex02_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium07_Imp_SeleniumCommands {

    @Test
    public void test_Method(){


        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");

        System.out.println(driver.getTitle()); // gets page title
        System.out.println(driver.getCurrentUrl()); // get current url
        System.out.println(driver.getPageSource()); // source code (html) -? text Html format


        driver.quit();

    }
}
