package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import javax.xml.stream.events.Comment;

public class RegisterResultPage extends Utils {

        //    String expectedRegisterSuccessMessage = "Your registration completed";
        public void verifyRegisterSuccessMessage() {
                Assert.assertEquals(getTextFromElement(By.xpath("//div[@class='result']")), "Your registration completed", "Your registration not successful");
                System.out.println("Your registration completed");
        }

        public void verifyCommentAddedSuccessfully() {
                Assert.assertEquals(getTextFromElement(By.xpath("//div[@class='result'")), "News comment is successfully added", "Comment not added successfully");
                System.out.println("New Comment is successfully adds.");
        }

        public void verifyCommentPresentInComments() {
                sleep(5000);
                boolean productDisplayed = driver.findElement(By.xpath("//div[@class='comment-content']")).isDisplayed();
                Assert.assertTrue(productDisplayed, "Comments are not redisplayed");
                System.out.println("Comments are displayed");

                boolean productDisplayed1 = driver.findElement(By.xpath("//span[@class='stat-value']")).isDisplayed();
                Assert.assertTrue(productDisplayed1, "Comments are not redisplayed");
                System.out.println("Last Comments displayed");

        }}