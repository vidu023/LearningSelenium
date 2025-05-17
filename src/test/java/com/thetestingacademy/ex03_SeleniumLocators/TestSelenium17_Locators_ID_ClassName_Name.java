package com.thetestingacademy.ex03_SeleniumLocators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium17_Locators_ID_ClassName_Name {

    @Description("TC#1 - Verify that Login is failed with invalid credentials & Error Message is displayed")
    @Owner("Vidya")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void test_VWO_InvalidLogin_Locators() throws InterruptedException {

        // Using EdgeOptions
        /*
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);// to maximize the window -> arguments is passed here
        */
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();

        // Step 1 - Find the EMAIL ID and enter the admin@admin.com.
        // Step 2 - Find the Password  and enter the 12345.
        // Step 3 - Find the Submit  and click on the button.
        // Step 4 - Wait some time.
        // Step 5 - Verify the error message.

        // Step 1 - Find the EMAIL ID and enter the admin@admin.com.
        // Total 5 attributes
        // <input (open tag)
        // type="email"
        // class="text-input W(100%)"
        // name="username"
        // id="login-username"
        // data-qa="hocewoqisi"
        // > (close tag)

        WebElement email_txtBox = driver.findElement(By.id("login-username"));
        email_txtBox.sendKeys("admin@admin.com");

        // Step 2 - Find the Password  and enter the 1234.
        // 2. Find the password inputbox and enter the password

        // <input
        // type="password"
        // class="text-input W(100%)"
        // name="password"
        // id="login-password"
        // data-qa="jobodapuxe">

        WebElement password_textBox = driver.findElement(By.name("password"));
        password_textBox.sendKeys("12345");

        // 3. Find the submit button and click on it.
        //<button
        // type="submit"
        // id="js-login-btn"
        // class="btn btn--positive btn--inverted W(100%) H(48px) Fz(16px)" // here this is dynamic in nature
        // onclick="login.login(event)"
        // data-qa="sibequkica">

        WebElement submit_button = driver.findElement(By.id("js-login-btn"));
        submit_button.click();

        // Step 4 - Wait some time.
        Thread.sleep(3000);
        // moment Thread.sleep() is added we need to handle exception
        // 1. using try catch block
        // 2. method signature


        // Step 5 - Verify the error message. -> using assertions
        //<div
        // class="notification-box-description"
        // id="js-notification-box-msg"
        // data-qa="rixawilomi">
        // Your email, password, IP address or location did not match
        // </div>

        WebElement err_msg = driver.findElement(By.className("notification-box-description"));
        System.out.println(err_msg.getText());

        Assert.assertEquals(err_msg.getText(),"Your email, password, IP address or location did not match");

        driver.quit();



    }
}
