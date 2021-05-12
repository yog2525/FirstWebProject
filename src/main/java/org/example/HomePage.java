package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utils{
    public void clickOnRegisterButton()
    {
        clickOnElement(By.linkText("Register"));
    }
    public void clickOnCurrencyField()
    {
        selectFromDropdownByVisibleText(By.id("customerCurrency"),"Euro");
        List<WebElement> featureProductList = driver.findElements(By.xpath("//span[@class='price actual-price']"));
        for (WebElement element :featureProductList)
        {
            System.out.println(element.getText());
        }
        System.out.println();
        selectFromDropdownByVisibleText(By.id("customerCurrency"), "US Dollar");
        featureProductList = driver.findElements(By.xpath("//span[@class='price actual-price']"));
        for (WebElement element :featureProductList)
        {
            System.out.println(element.getText());
        }
        }
        public void typeInSearchField()
        {
            enterText(By.id("small-searchers"),"Nike");
            clickOnElement(By.xpath("//button[@type='submit']"));
        }
        public void addToCartButtonShouldBePresent()
        {
            clickOnElement(By.linkText("Computers"));
            sleep(5000);
        }
        public void commentAddedWithTitleAndComment()
        {
            clickOnElement(By.linkText("New online store is open!"));
        }
}

