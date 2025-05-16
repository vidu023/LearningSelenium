package com.thetestingacademy.ex02_SeleniumBasics;

import org.openqa.selenium.edge.EdgeDriver;

public class TestSelenium13_HTTPS_isImportant {

    public static void main(String[] args) {

        EdgeDriver driver = new EdgeDriver();
//      driver.get("bing.com"); // this url wont work -> HTTPs is important.
        driver.get("https://bing.com"); // HTTPs is important.

        driver.quit();

    }
}
