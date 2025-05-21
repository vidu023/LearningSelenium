package com.thetestingacademy.ex10_ActionsClass;

import com.thetestingacademy.CommonBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestSelenium32_Drag_nDrop extends CommonBaseClass {

    @Test
    public void test_Drag_nDrop(){

        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);

        // Source , Destination
        //  from and to
        WebElement from = driver.findElement(By.id("column-a"));
        WebElement to = driver.findElement(By.id("column-b"));

        actions.dragAndDrop(from,to).build().perform();

        // dragAndDrop() uses move & ticks -> click, hold then drag and  from here to there

    }
}
