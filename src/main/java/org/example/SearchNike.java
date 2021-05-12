package org.example;

import org.openqa.selenium.By;

public class SearchNike extends Utils{
    public void searchNikeName()
    {
        list(By.xpath("//h2[@class='product-title']"));
    }
}
