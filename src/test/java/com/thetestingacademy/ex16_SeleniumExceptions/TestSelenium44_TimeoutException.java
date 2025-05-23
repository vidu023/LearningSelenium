package com.thetestingacademy.ex16_SeleniumExceptions;

import com.thetestingacademy.CommonBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium44_TimeoutException  extends CommonBaseClass {

    @Test
    public void test_selenium_exceptions() {

        System.out.println("Start of program");
        driver.get("https://google.com");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='abc']")));

        // Here we know that such element -> By.xpath is not available,
        // but time duration of 10 seconds is not enough to throw NoSuchElementException
        // therefore it sends out TimeoutException as duration is not enough to search that element

        WebElement search_inputbox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        search_inputbox.sendKeys("the testing academy");

    }

}
