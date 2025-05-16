package com.thetestingacademy.ex02_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium11_changeDriver {

    @Description("To check if driver can be changed in between")
    @Test
    public void test_changeDriver(){

        //if we use ChromeDriver we cannot -> it will throw error
        //ChromeDriver driver = new ChromeDriver();
        //driver = new FirefoxDriver();

        //but using WebDriver we can
        WebDriver driver = new ChromeDriver();
        driver = new EdgeDriver();

    }
}
