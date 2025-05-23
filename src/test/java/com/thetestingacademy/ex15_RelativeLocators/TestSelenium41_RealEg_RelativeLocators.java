package com.thetestingacademy.ex15_RelativeLocators;

import com.thetestingacademy.CommonBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class TestSelenium41_RealEg_RelativeLocators extends CommonBaseClass {

    // Interview Question

    @Test
    public void test_RealEg_RL(){

        driver.get("https://www.aqi.in/real-time-most-polluted-city-ranking");
        driver.manage().window().maximize();

        WebElement searchTbx = driver.findElement(By.xpath("//input[@placeholder = 'Search']"));
        searchTbx.sendKeys("India" + Keys.ENTER);

        waitForJVM(3000);

        List<WebElement> locations = driver.findElements(By.xpath("//div[contains(@class,\"location-name\")]/p"));
        for(WebElement location : locations){

            String rank = driver.findElement(with(By.tagName("p")).toLeftOf(location)).getText();
            String aqi = driver.findElement(with(By.tagName("span")).toRightOf(location)).getText();

            String status = driver.findElement(with(By.xpath("//div[contains(@class, \"aqi-status\")]"))).getText();

            System.out.println("| +" + rank + " | " + location.getText() + " | " + aqi + " | " + status + " | ");


        }
    }
}
