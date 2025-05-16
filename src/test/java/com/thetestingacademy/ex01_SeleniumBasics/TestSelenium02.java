package com.thetestingacademy.ex01_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium02 {

    @Description("Open the app.vwo.com and verify the title!")
    @Test
    public void test_Selenium02() {
        // Open the URL
        ChromeDriver driver = new ChromeDriver();
        // new EdgeDriver(); -> POST Request(Browser Driver) (localhost:XXXXX),
        // Create New Session Endpoint - 16 digit Unique ID is also created.

        // Navigate the URL -> HTTP GET the URL
        driver.get("https://app.vwo.com");

        // Assert the URL - Validation - TestNG Assertions
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");

        driver.quit(); // Close the session!
    }

}
