package com.thetestingacademy.ex03_SeleniumLocators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium18_Locators_LinkTest_PartialLinkText {

    @Description("TC#1 - Verify LinkText & PartialLinkText works")
    @Owner("Vidya")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void test_VWO_LinkText_Locators() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();

        // Find the text (link) & Click
        // <a href="https://vwo.com/free-trial/?utm_medium=website&amp;utm_source=login-page&amp;utm_campaign=mof_eg_loginpage"
        // class="text-link"
        // data-qa="bericafeqo">
        // Start a free trial -> text to check & Click
        // </a>

        // Link Text - Full Text Match
        // If the element locator is invalid - no such element: Unable to locate element: {"method":"link text","selector":"Start a free tria"}
        /* WebElement linkText = driver.findElement(By.linkText("Start a free trial"));
        linkText.click();  */

        // Partial Link Text - Will Match with many scenarios
        // Start a free trial
        // Start a free
        // Start a
        // Start , Trail, free, a, Star...
        WebElement partial_LinkText = driver.findElement(By.partialLinkText("trial"));
        partial_LinkText.click();

        // we can use any one of the above & not both

        driver.quit();

        //findElement will always give you the 1st matching element


    }
}
