package com.thetestingacademy.ex12_Windows;

import com.thetestingacademy.CommonBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class TestSelenium34_WindowHandles extends CommonBaseClass {

    @Test
    public void test_WindowHandles(){

        String URL = "https://the-internet.herokuapp.com/windows";
        driver.get(URL);
        driver.manage().window().maximize();

        // Store the handle of the current(parent) window
        String parent = driver.getWindowHandle();
        System.out.println(parent);
        // F7AA36051FE6F4D39469CAE2A28D73E7

        // Find the "Click Here" link
        WebElement link = driver.findElement(By.linkText("Click Here"));
        // (By.xpath("//a[text()=\"Click Here\"]"))

        // Click the link to open a new window
        link.click();

        // Store the handles of all open windows in a list
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles);
        // [48AE873DA3E0FB1C700E265888D58BA1, C87A220A1E258FC2FAF91BAE06F1DBC7]

         // Iterate through the list of window handles
        for (String handle : windowHandles) {
            // Switch the focus to each window in turn
            driver.switchTo().window(handle);

            // Check if the text "New Window" is present in the window
            if (driver.getPageSource().contains("New Window")) {
                System.out.println("Test Case Passed!");
            }
        }

        // Switch the focus back to the main window -> parent
        driver.switchTo().window(parent);

    }
}
