package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utility{
    public void registerPage(){
     clickOnElement(By.linkText("Register"));
    }
    public void loginPage(){
        clickOnElement(By.xpath("//a[@class='ico-login']"));
    }
    public void referToFriend(){
        clickOnElement(By.className(""));
    }
    public void buildComputer(){
        clickOnElement(By.className(""));
    }
    public void cameraAndPhotoPage(){
        hooverOverElement(By.xpath("//div/ul[@class='top-menu notmobile']/li[2]/a"));
    }

}
