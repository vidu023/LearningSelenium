package com.thetestingacademy.ex02_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium03 {

    @Description("Open the App.vwo.com and Get the title")
    @Test
    public void test_Selenium() {

        // Selenium 3
        // we had to download the drive & set its path using system.getProperty() method
        //System.getProperty("webdriver.gecko.driver","/path/geckdriver");

        // Selenium 4
        // Selenium Manager - utility - Which can download the driver automatically
        // start and stop itself.
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://google.com");        // You need to setup the Driver(browser)

        // but in 4 we don't need to download drivers anymore



    }
}
