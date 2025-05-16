package com.thetestingacademy.ex02_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.*;

public class TestSelenium09_Assertions_AssertJ {

    // Boiler code starts from here
    @Description("To check Assertions")
    @Test
    public void test_Method(){


        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");
        // ends here

        Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.com/");

        // AssertJ Validation
        assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("https://www.google.com/");

        // we can add both or any 1 of the assertions as required.


        driver.quit();

    }
}
