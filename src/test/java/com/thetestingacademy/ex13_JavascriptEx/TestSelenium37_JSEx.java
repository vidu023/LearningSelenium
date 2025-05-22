package com.thetestingacademy.ex13_JavascriptEx;

import com.thetestingacademy.CommonBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestSelenium37_JSEx extends CommonBaseClass {

    @Test
    public void test_JS_ex(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://selectorshub.com/xpath-practice-page/");

        WebElement scroll = driver.findElement(By.xpath("//div[@id='userName']"));
        js.executeScript("window.scrollBy(0, 500);");

        String url = js.executeScript("return document.URL;").toString();
        String title = js.executeScript("return document.title;").toString();

       System.out.println(url);
       System.out.println(title);

    }
}
