package com.thetestingacademy.ex15_RelativeLocators;

import com.thetestingacademy.CommonBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class TestSelenium40_RelativeLocators_Eg2 extends CommonBaseClass {

    @Test
    public void test_RelativeLocator2_JSForm() {

        //It's a JS Form Validation -> build inside iFrame
        // We can check error message without Relative Locators

        // Interview Question of Virtusa -> Specifying to use Relative Locators

        driver.get("https://codepen.io/AbdullahSajjad/full/LYGVRgK");
        driver.manage().window().maximize();

        // first we need to switch to frame
        driver.switchTo().frame("result");
        // iframe id = "result"

        //click on submit button to see the error message on each element
        driver.findElement(By.xpath("//form[@id = \"form\"]/button")).click();

        // check error message on the username
        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));

        // By.xpath directly -> //small[text()="Username must be at least 3 characters"]
        // but this may fail if the developer changes the text  as we are using the text directly as the locator
        // but using below as locator our testcase won't fail -> only the assert will fail
        WebElement errMsg_uname = driver.findElement((with(By.tagName("small")).below(username)));

        String errMsg_unameText = errMsg_uname.getText();
        Assert.assertEquals(errMsg_unameText, "Username must be at least 3 characters");

        // check error message on Email
        WebElement email = driver.findElement(By.xpath("//input[@id = 'email']"));
        WebElement errMsg_email = driver.findElement((with(By.tagName("small")).below(email)));
        String errMsg_emailTxt = errMsg_email.getText();
        Assert.assertEquals(errMsg_emailTxt, "Email is not invalid");
    }
}
