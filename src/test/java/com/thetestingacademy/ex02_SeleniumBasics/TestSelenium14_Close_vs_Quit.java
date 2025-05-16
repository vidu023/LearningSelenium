package com.thetestingacademy.ex02_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium14_Close_vs_Quit {

     public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");


//        Thread.sleep(5000);
//        driver.close();

          // Close - will close the current tab, not the session (not the all tabs);
          // session is still open
          // session id != null



        Thread.sleep(5000);

        driver.quit();
        // It will close all the tabs. - session id == null


    }
}
