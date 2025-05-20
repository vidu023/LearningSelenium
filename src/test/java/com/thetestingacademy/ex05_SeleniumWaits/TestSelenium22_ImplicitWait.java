package com.thetestingacademy.ex05_SeleniumWaits;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestSelenium22_ImplicitWait {

    //rarely using it
    // implicitly telling each elements to wait for 30 sec

    @Description("Implicit Wait")
    @Test
    public void test_Implicitwait() {

        EdgeDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //implicit wait is used here at the start of the program as its used for al elements
        //before the program starts
        driver.get("https://app.vwo.com");

        driver.quit();
    }

}
