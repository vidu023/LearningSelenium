package com.thetestingacademy.ex02_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium12_Navigation_GET_NAVIGATETO {

    @Description("Navigate To function has different methods")
    @Test
    public void test_Navigation() throws Exception {

        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com"); // 95%

        //  Use Navigation Commands

        // driver.get("url") -> Navigate to a URL
        // with get() there is no option to go back, go forward or refresh
        // so we use navigate().to for doing this


        // Use navigation methods
        driver.navigate().to("https://bing.com");
        driver.navigate().back(); // go back to previous page
        driver.navigate().refresh(); // refresh the page
        driver.navigate().forward(); // go to next page i.e. forward




    }
}
