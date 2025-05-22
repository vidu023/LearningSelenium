package com.thetestingacademy.ex12_Windows;

import com.thetestingacademy.CommonBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class TestSelenium35_IFrames_Interview extends CommonBaseClass {

    @Test
    public void test_iframes(){

        driver.get("https://app.vwo.com/#/test/ab/13/heatmaps/1?token=eyJhY2NvdW50X2lkIjo2NjY0MDAsImV4cGVyaW1lbnRfaWQiOjEzLCJjcmVhdGVkX29uIjoxNjcxMjA1MDUwLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiY2IwNzBiYTc5MDM1MDI2N2QxNTM5MTBhZDE1MGU1YTUiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&isHttpsOnly=1");
        driver.manage().window().maximize();

        waitForJVM(5000);

        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent -> " + parentWindow);

        List<WebElement> list = driver.findElements(By.xpath("//div[@data-qa= 'yedexafobi']"));
        // By.xpath("//img[@data-qa = 'danawobuqa']")
        Actions actions = new Actions(driver);

        actions.moveToElement(list.get(1)).click().build().perform();

         waitForJVM(15000);


        Set<String> allHandles  =  driver.getWindowHandles();
        System.out.println(allHandles);

        for (String handle: allHandles) {

            if (!handle.equals(parentWindow)) {
                driver.switchTo().window(handle);
                driver.switchTo().frame("heatmap-iframe");
                WebElement click_map_button = driver.findElement(By.xpath("//span[@data-qa=\"refoyekife\"]"));
                click_map_button.click();

            }
        }


    }
}
