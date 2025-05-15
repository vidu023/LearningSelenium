package com.thetestingacademy.ex01_SeleniumBasics;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium01 {

    @Test
    public void test_VWOLoginPage(){
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://app.vwo.com/#/login");
        System.out.println(chromeDriver.getTitle());
        chromeDriver.quit();
    }

}
