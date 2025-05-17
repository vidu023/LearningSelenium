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

public class TestSelenium19_Locators_TagName {

    @Description("TC#1 - Verify Error message is seen when entered wrong email address")
    @Owner("Vidya")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void test_VWO_TagName_Locators() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();

        WebElement linkText = driver.findElement(By.linkText("Start a free trial"));
        linkText.click();

        // assertion to check the url contains free trial text or not
        // url -> https://vwo.com/free-trial/?utm_medium=website&utm_source=login-page&utm_campaign=mof_eg_loginpage
        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));

        // STep 1: Enter email address in the given textbox
        // <input
        // class="W(100%) Py(14px) input-text invalid-input"
        // placeholder="name@yourcompany.com"
        // type="email"
        // id="page-v1-step1-email"
        // name="email" data-qa="page-su-step1-v1-email"
        // required="" data-gtm-form-interact-field-id="0">

        WebElement email_txtBox = driver.findElement(By.id("page-v1-step1-email"));
        email_txtBox.sendKeys("admin");

        // checkbox is also a kind of input box
        // <input
        // class="Cur(p) Flxs(0) M(0) Pos(r) T(2px)"
        // type="checkbox" -> here type is checkbox -> it can be text, radio
        // name="gdpr_consent_checkbox"
        // id="page-free-trial-step1-cu-gdpr-consent-checkbox"
        // value="true"
        // data-qa="page-free-trial-step1-gdpr-consent-checkbox"
        // data-gtm-form-interact-field-id="0">

        WebElement checkBox = driver.findElement(By.name("gdpr_consent_checkbox"));
        checkBox.click();

        // Click on the button
        // <button
        // type="submit"
        // class="button W(100%) btn-modal-form-submit"
        // data-qa="page-su-submit">
        // Create a Free Trial Account
        // </button>

        // now we are stuck we dont have id, name & className is dynamic but we know its a button
        WebElement button = driver.findElement(By.tagName("button"));
        button.click();

        //Assertion to check if we are getting an error message
        // <div
        // class="C($color-red) Fz($font-size-12) Trsp($Op) Trsdu(0.15s) Op(0) invalid-input+Op(1) invalid-reason">
        // The email address you entered is incorrect.
        // </div>

        // className looks dynamic in nature ->
        // the space means all are individual multiple class
        // invalid-reason is not dynamic -> static -> we can use it

        Thread.sleep(3000);

        WebElement err_msg = driver.findElement(By.className("invalid-reason"));
        System.out.println(err_msg.getText());


        Assert.assertEquals(err_msg.getText(),"The email address you entered is incorrect.");

        driver.quit();

    }
}
