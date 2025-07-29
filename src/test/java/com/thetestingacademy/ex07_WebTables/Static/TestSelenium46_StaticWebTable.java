package com.thetestingacademy.ex07_WebTables.Static;

import com.thetestingacademy.CommonBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium46_StaticWebTable extends CommonBaseClass {

    // when we have uneven rows & columns

    @Test
    public void test_StaticWebTable() {

        driver.get("https://awesomeqa.com/webtable1.html");
        driver.manage().window().maximize();

        // Find the xPath for the WebTable
        // -> table[@summary="Sample Table"]

        // we dont want header & footer but just the table
        WebElement table = driver.findElement(By.xpath("//table[@summary='Sample Table']/tbody"));

        // rows
        List<WebElement> rows = table.findElements(By.tagName("tr"));

        for(int i=0; i<rows.size(); i++){
            List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
            for (WebElement c: cols){
                System.out.println(c.getText());
            }


        }





    }
}
