package com.thetestingacademy.ex02_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class TestSelenium16 {

    @Description("Options Class")
    @Test
    public void test_Selenium01() throws Exception {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-size=1920,1080");
        // copying crx file into addExtensions
        chromeOptions.addExtensions(new File("src/test/java/com/thetestingacademy/ex02_SeleniumBasics/Adblock-Plus-free-ad-blocker-Chrome-Web-Store.crx"));

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.youtube.com/watch?v=BwTSxsAqlEc"); // now this youtube video will run ad free


        driver.manage().deleteAllCookies(); // delete all cookies
        driver.quit();



    }
}
