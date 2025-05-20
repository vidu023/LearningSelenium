package com.thetestingacademy.ex04_SeleniumXPATH;

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

public class TestSelenium21_Locators_XPath {

    @Owner("Vidya Kini")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify Login does not work if entered wrong username & password")
    @Test
    public void test_OrangeHRM_Login() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        driver.manage().window().maximize();

        WebElement txt_uname = driver.findElement(By.xpath("//input[@placeholder = 'Username']"));
        txt_uname.sendKeys("admin@gmail.com");

        WebElement txt_pwd = driver.findElement(By.xpath("//input[@placeholder = 'Password']"));
        txt_pwd.sendKeys("12345");

        WebElement btn_Login = driver.findElement(By.xpath("//button[@type='submit']"));
        // WebElement btn_Login = driver.findElement(By.className("orangehrm-login-button"));
        btn_Login.click();

        Thread.sleep(3000);

        //Assert.assertTrue(driver.findElement(By.className("orangehrm-login-error")));
        if(driver.getPageSource().contains("Invalid credentials")){
            System.out.println("Test Case Passed!");
            Assert.assertTrue(true);
        }
        else {
            Assert.fail("Invalid credentials Text is not visible");
        }

        driver.quit();

    }
}
