package org.example;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ComputerPage extends Utils{
    public void clickOnSoftware (){
        clickOnElement(By.xpath("//ul[@class='sublist']/li[3]/a"));

    }
}
