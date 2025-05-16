package com.thetestingacademy.ex02_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium08_Maximize_Minimize {

    @Description("Open the URL")
    @Test
    public void test_Method(){


        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");

        // can be used only 1
        driver.manage().window().maximize(); // to maximize the screen
        // driver.manage().window().minimize(); // to minimize the screen

        System.out.println(driver.getTitle()); // gets page title
        System.out.println(driver.getCurrentUrl()); // get current url
        System.out.println(driver.getPageSource()); // source code (html) -? text Html format


        driver.quit();

    }
}
