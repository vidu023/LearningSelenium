package com.thetestingacademy.ex05_SeleniumWaits;

import com.thetestingacademy.CommonBaseClass;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium24_Modal_ExplicitWait extends CommonBaseClass {

    @Description("Verify MakemyTrip Modal/ Popup opens when we open the website")
    @Test
    public void test_closeModal() {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);


        driver.navigate().to("https://www.makemytrip.com");
        System.out.println(driver.getTitle());


        // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy = 'closeModal']")));
        // instead a method created in CommonBaseClass by extending it
        waitForVisibility(driver,3,"//span[@data-cy='closeModal']"); // we can use this also
        // -> waitForVisibility(Driver, duration, xpath of that element)

        WebElement closeModel = driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]"));
        closeModel.click(); // close it after you fetch that element
    }
}
