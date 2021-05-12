package org.example;

import org.openqa.selenium.By;

public class NewOnlinePage extends Utils{
    public void typeComment(){

        sleep(5000);
        enterText(By.xpath("//input[@class='enter-comment-title']"),"Very Slow Website");
        enterText(By.id("AddNewComment_CommentText"),"Very Good Store but Product is over Price");
        sleep(5000);
        clickOnElement(By.xpath("//button[@name='add-comment']"));
    }
}
