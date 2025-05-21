package com.thetestingacademy.ex11_FileUpload;

import com.thetestingacademy.CommonBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestSelenium33_FileUpload extends CommonBaseClass {

    @Test
    public void test_FileUpload(){

        // Selenium can only drag & drop a file if its an input element
        // This is the only way of File Uploading Selenium supports

        driver.get("https://awesomeqa.com/selenium/upload.html");
        WebElement uploadFileInput = driver.findElement(By.id("fileToUpload"));

        String working_dir = System.getProperty("user.dir");
        // \Users\Vaishak Kini\IdeaProjects\LearningSelenium
        // each one has a different working dir path (user.dir) & it will work only on your machine
        // -> so it better to get that path from get.property method of Selenium -> JVM will decide which path to take

        //total path would be -> user.dir + data.txt (path) i.e. -> src/test/java/com/thetestingacademy/Data.txt
        String file_path = working_dir+"/src/test/java/com/thetestingacademy/Data.txt";

        // using inbuilt function -> uploadFileInput
        uploadFileInput.sendKeys(file_path);
        driver.findElement(By.name("submit")).click();

    }
}
