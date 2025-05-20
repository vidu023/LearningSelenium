package com.thetestingacademy.ex06_Input_Select_Radio_Alerts_Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestSelenium27_Select_StaticDropdown {

    public static void main(String[] args) {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();



        WebElement element_select = driver.findElement(By.id("dropdown")); // select tag has id dropdown

        // By using Select class for DropDown
        Select select = new Select(element_select); // that is being passed in the instance of Select
        // select.selectByIndex(1);
        // select.selectByVisibleText("Option 1");
        // it can be selected using other different elements
        select.selectByValue("2");

    }
}
