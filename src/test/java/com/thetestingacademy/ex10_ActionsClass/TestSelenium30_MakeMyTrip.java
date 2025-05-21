package com.thetestingacademy.ex10_ActionsClass;

import com.thetestingacademy.CommonBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TestSelenium30_MakeMyTrip extends CommonBaseClass {

    @Test
    public void test_MakeMyTrip_AC(){

        String URL = "https://www.makemytrip.com/";
        driver.get(URL);
        driver.manage().window().maximize();

        // Wait for the popup to come and click the x icon
        //span[@data-cy='closeModal']

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy=\"closeModal\"]")));

        // Once we got the Element -> This will close the modal by clicking on it
        WebElement model = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        model.click();

        WebElement fromCity = driver.findElement(By.xpath("//input[@data-cy=\"fromCity\"]"));

        // sendKeys -> normal
        // popups, moveElement -> actions.send is used


        Actions actions = new Actions(driver);
        actions.moveToElement(fromCity).click().sendKeys("IXC").build().perform();
        
        // putting some wait time -> method from BaseClass
        waitForJVM(3000);

         try {
             // ui tag has list of li tags -> se we are using List
            List<WebElement> list_auto = driver.findElements(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]/li"));

             // it will search for the text that contains Chandigarh till it finds,
             // it will traverse and then click once found
            for (WebElement e:  list_auto){
                if(e.getText().contains("Chandigarh")){
                    e.click();
                }
            }
        } catch (StaleElementReferenceException e) {
             // sometimes some testcases have Stale Exceptions-> so ignoring here
            System.out.println("Ignore this");
        }




    }
}
