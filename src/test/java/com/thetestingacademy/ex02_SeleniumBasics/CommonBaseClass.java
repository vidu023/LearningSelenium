package com.thetestingacademy.ex02_SeleniumBasics;

import org.openqa.selenium.WebDriver;

public class CommonBaseClass {

    // to open the browser
    public void openBrowser(WebDriver driver, String url){
        driver.get(url);
        driver.manage().window().maximize();
    }

    // to quit from the browser
    public void closeBrowser(WebDriver driver){
        driver.quit();
    }
}
