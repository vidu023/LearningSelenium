package com.thetestingacademy.ex08_HandlingSVG;

import com.thetestingacademy.CommonBaseClass;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium48_SVGMaps_State extends CommonBaseClass {

    @Test
    @Description("Verify Tripura is present in the map and click to zoom it")
    public void test_India_map_SVG(){

        driver.get("https://www.amcharts.com/svg-maps/?map=india");
        driver.manage().window().maximize();

        //local-name(), name() are the built in functions of xpath

        // How to find the state "Tripura" -> svg
        // svg -> 19 g -> 7th g tag has india map image -> which further has g -> g-> path -> states

        // 36 States path - //*[local-name()='svg']/*[name()="g"][7]/*[name()="g"]/*[name()="g"]/*[name()="path"]

        // list all the states here
        List<WebElement> states = driver.findElements(By.xpath("//*[name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path']"));
        // to find tripura -> aria-label
        // tripura needs to be searched using for loop
        for (WebElement state:  states) {
            System.out.println(state.getAttribute("aria-label")); // this will print all the states
            // getAttribute() is deprecated in selenium
            if(state.getAttribute("aria-label").contains("Tripura")){
                state.click();
            }
        }
    }
}
