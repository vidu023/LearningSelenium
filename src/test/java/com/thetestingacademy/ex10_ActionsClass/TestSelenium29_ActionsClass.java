package com.thetestingacademy.ex10_ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestSelenium29_ActionsClass {

    @Test
    public void test_ActionsClass(){

        WebDriver driver = new EdgeDriver();
        String URL = "https://www.spicejet.com/";
        driver.get(URL);
        driver.manage().window().maximize();

        // as we don't have any unique element in the input tag we move upwards to find the unique locator,
        // and then we need to track it down to that element -> /div/div/input
        WebElement source = driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]/div/div/input"));
        //source.sendKeys(""); // this wont work here

        Actions actions = new Actions(driver);
        // move to Element
        // click
        // sendKeys

        actions.moveToElement(source).click().sendKeys("BLR").build().perform();
        // if we don't write build().perform() -> then action wont be performed

        driver.quit();

    }
}
