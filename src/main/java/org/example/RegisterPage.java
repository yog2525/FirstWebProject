package org.example;

import javafx.animation.KeyFrame;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.sql.Timestamp;

public class RegisterPage extends Utils{
    public void userEntersRegistrationDetails() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());


        sleep(5000);
        clickOnElement(By.xpath("//input[@id='gender-male']"));
        enterText(By.id("FirstName"), "Ajay");
        enterText(By.id("LastName"), "Patel");
        selectFromDropdownByValue(By.name("DateOfBirthDay"), "24");
        selectFromDropdownByVisibleText(By.name("DateOfBirthMonth"), "May");
        selectFromDropdownByValue(By.name("DateOfBirthYear"), "1985");
        enterText(By.id("Email"), "ajaypatel" + timestamp.getTime() + "@gmail.com");
        enterText(By.name("Company"), "simple");
        enterText(By.name("Password"), "123456");
        enterText(By.name("ConfirmPassword"), "123456");
        clickOnElement(By.id("register-button"));
    }}

