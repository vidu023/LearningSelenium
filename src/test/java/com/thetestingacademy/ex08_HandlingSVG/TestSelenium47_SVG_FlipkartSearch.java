package com.thetestingacademy.ex08_HandlingSVG;

import com.thetestingacademy.CommonBaseClass;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium47_SVG_FlipkartSearch extends CommonBaseClass {

    @Test
    @Description("Verify that the on search with svg icon results are visible.")
    public void test_Flipkart_Search_SVG_Icon(){

        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        // Step 1 - Enter the "macmini" in the inputbox.
        driver.findElement(By.name("q")).sendKeys("macmini");

        // Step 2 - Click on the svg element.
        List<WebElement> svgElements = driver.findElements(By.xpath("//*[local-name()='svg']"));
        svgElements.get(0).click(); // 1st element is the search icon -> 0

        // print all the names of the fetched items of page  -> its title
        List<WebElement> titleResult = driver.findElements((By.xpath("//div[contains(@data-id,'CPU')]/div/a[2]")));
        for (WebElement title : titleResult){
            System.out.println(title.getText());
        }

    }

}

//div[contains(@data-id,'CPU')]/div/a[2] ->  only title
//div[contains(@data-id,'CPU')]/div/a ->  all 3 items -> image, title & price