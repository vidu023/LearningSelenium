package com.thetestingacademy.ex07_WebTables.Static;

import com.thetestingacademy.CommonBaseClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestSelenium45_StaticWebTable extends CommonBaseClass {

    @Test
    public void test_StaticWebTable() {

        driver.get("https://awesomeqa.com/webtable.html");
        driver.manage().window().maximize();

        // xpath ->  //table[@id="customers"]/tbody/tr[5]/td[2]


        //xpath - //table[@id="customers"]/tbody/tr[
        // i -> row
        // ]/td[
        // j -> column
        // ]

        String first_part = "//table[@id=\"customers\"]/tbody/tr[";
        String second_part = "]/td[";
        String third_part = "]";

        // tr -> will give row
        int row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
        // and td -> will give column of that row -> tr[2]/ td -> here 2 means 2nd row
        int col = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[2]/td")).size();
        //size() will give the total rows/ columns

        // here i = 2 because the data starts from 2nd row, 1st row is the Heading
        for (int i = 2; i <= row; i++) {
            for (int j = 1; j <= col; j++) {

                String dynamic_path = first_part + i + second_part + j + third_part;
                // this will print all the dynamic paths of each element present in the table
                // System.out.println(dynamic_path);
                String data = driver.findElement(By.xpath(dynamic_path)).getText();
                // this will print all the data inside the table -> of each element
                // System.out.println(data);

                if (data.contains("Helen Bennett")) {
                    // we want to print the Country i.e. next following sibling of Helen Bennett
                    // i.e. td -> col value of Country where Helen Bennett lives
                    String country_path = dynamic_path + "/following-sibling::td";
                    String country_text = driver.findElement(By.xpath(country_path)).getText();
                    System.out.println("------");
                    System.out.println("Helen Bennett lives in - " + country_text);

                }

            }
        }
    }
}
