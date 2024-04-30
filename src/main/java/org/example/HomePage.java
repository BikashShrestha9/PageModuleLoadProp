package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends Utility{
    //navigating to register page from home page
    public void registerPage(){
     clickOnElement(By.linkText("Register"));
    }
    //navigating to login page from home page
    public void loginPage() {
        clickOnElement(By.xpath("//a[@class='ico-login']"));

    }
    public void referToFriend(){
        clickOnElement(By.className(""));
    }
    public void buildComputer(){
        clickOnElement(By.xpath("//div[@class='product-grid home-page-product-grid']/div[2]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]"));
    }
    // navigating to camera and photo page from home page
    public void cameraAndPhotoPage(){
        hooverOverElement(By.xpath("//div/ul[@class='top-menu notmobile']/li[2]/a"));
    }

}
