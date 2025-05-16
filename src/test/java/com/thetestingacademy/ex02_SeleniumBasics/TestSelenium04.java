package com.thetestingacademy.ex02_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium04 {

     // Webdriver hierarchy

    // SearchContext(I) -> (2) -> WebDriver(I)( 10) -> RemoteWebDriver(C) (15)
    //        //// -> ChromiumDriver(C) 25 -> EdgeDriver(C) (45)


    // SearchContext - Interface - findElement, and findElements - GGF - 2 methods
    // WebDriver - Interface - some incomplete functions - GF - 10 methods
    // RemoteWebDriver - Class- It also has some functions - F - 15 methods
    // ChromeDriver (25), FirefoxDriver, EdgeDriver (almost 45 methods), SafariDriver, InternetExplorerDriver  Class - S



    public static void main(String[] args) {
        // All possible
//        SearchContext driver = new ChromeDriver();
//        SearchContext driver = new EdgeDriver();
//        SearchContext driver = new FirefoxDriver();
//        SearchContext driver = new InternetExplorerDriver();

//        WebDriver driver = new ChromeDriver();

//        RemoteWebDriver driver = new ChromeDriver();

//        ChromeDriver  driver = new ChromeDriver();


        // Scenarios

        // 1. Do want to run on  Chrome or Edge?
        // No Compulsion then we can choose any driver
        // ChromeDriver driver = new ChromeDriver();

        // 2  Do you want to run on Chrome then change to Edge ?
        // If I might change from Chrome which i was initially using it but now want to change it to Edge or FF
        // then use WebSDriver
        WebDriver driver = new ChromeDriver();
        driver = new EdgeDriver(); // 97% -
        driver = new FirefoxDriver(); // 97% -

        // 3. do you want to run on multiple browsers, aws machine, ? 2%
        // RemoteWebDriver driver (with GRID) - Advance (Last 2 Sessions)
    }

}
