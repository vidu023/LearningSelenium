package com.thetestingacademy.ex02_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium10_MiniProject1 extends CommonBaseClass{

    @Description("To check text from Page Source")
    @Test
    public void testSelenium_miniProject() throws Exception {


        // instead of using boiler code we can create 2 function  openBrowser & closeBrowser,
        // to use in a common class and method can be called here
        /*
        WebDriver driver = new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com");
        driver.manage().window().maximize();
        */

        // extends CommonBaseClass must be mentioned
        WebDriver driver = new EdgeDriver();
        openBrowser(driver, "https://katalon-demo-cura.herokuapp.com");

        if(driver.getPageSource().contains("CURA Healthcare Service")){
            System.out.println("Test Case Passed!");
            Assert.assertTrue(true);
        }
        else {
            // use any one of the below statement
            Assert.fail("CURA Healthcare Service Text is not visible");
            //throw new Exception("CURA Healthcare Service text is not visible");
        }

        //driver.quit();
        //instead of above function we can use below method
        closeBrowser(driver);
    }
}
