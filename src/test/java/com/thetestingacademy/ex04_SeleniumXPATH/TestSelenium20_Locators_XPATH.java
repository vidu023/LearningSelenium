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

import java.util.List;

public class TestSelenium20_Locators_XPATH {

    @Description("Verify that with Valid Email & Password - Appointment Page is loaded")
    @Owner("Vidya")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void test_katlon_login() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();

        // WebElement make_appointment_btn_id = driver.findElement(By.id("btn-make-appointment"));
        // make_appointment_btn_id.click();

        WebElement make_appt_Btn = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        // (By.xpath("//a[@id=\"btn-make-appointment"\]") -> we can remove forward slash if we are using single quote
        make_appt_Btn.click();

        // suppose we don't have id & we have placeholder as unique attribute to use for automation
        // but placeholder with the same value is used twice,
        // so we use List of WebElements -> findElements -> and its location -> here it would be 1 place
        List<WebElement> txt_Username = driver.findElements(By.xpath("//input[@placeholder='Username']"));
        txt_Username.get(1).sendKeys("John Doe");

        List<WebElement> txt_Password = driver.findElements(By.xpath("//input[@placeholder='Password']"));
        txt_Password.get(1).sendKeys("ThisIsNotAPassword");

        WebElement login_Btn = driver.findElement(By.xpath("//button[@id='btn-login']"));
        login_Btn.click();

         Thread.sleep(3000);

        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");

        driver.quit();



    }
}
