package com.thetestingacademy.ex10_ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestSelenium28_ActionsClass {

    @Test
    public void test_actions() {

        WebDriver driver = new EdgeDriver();
        String URL = "https://awesomeqa.com/practice.html";
        driver.get(URL);
        driver.manage().window().maximize();

        // Keys - Action classes
        WebElement firstName = driver.findElement(By.name("firstname"));

        // firstName.sendKeys("THE TESTING ACADEMY"); // it can sent like this also

        // using Actions Class we are trying to display in Caps with the Text we are sending,
        // but we are using the help of Keyboard event here
        // SHIFT + Alphabet -> gives in CAPS
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.SHIFT)
                .sendKeys(firstName,"the testing academy")
                .keyUp(Keys.SHIFT).build().perform(); // build().perform() means it will perform the action

        driver.quit();

    }

}
