package com.thetestingacademy.ex14_JS_ShadowDOM;

import com.thetestingacademy.CommonBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestSelenium38_JS_ShadowDOM extends CommonBaseClass {

    @Test
    public void test_JS(){

        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();

        waitForJVM(3000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        // we want to return that input box so that we can sendKeys -> FarmHouse
        WebElement inputBox_Pizza = (WebElement) js.executeScript("return document.querySelector(\"div#userName\").shadowRoot.querySelector('div#app2').shadowRoot.querySelector('#pizza');");
        inputBox_Pizza.sendKeys("Farmhouse");
    }
}
