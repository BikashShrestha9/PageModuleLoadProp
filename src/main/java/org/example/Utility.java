package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


import java.io.File;
import java.io.IOException;
import java.security.Timestamp;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Utility extends BasePage {
    LoadProperty loadProperty=new LoadProperty();
    Date date=new Date();
    protected String timeStamp;

    protected  String email;

    //method to click
    public void clickOnElement(By by) {
        WebElement element = driver.findElement(by);
        element.click();
    }
    //method to hoover over the element
    public void hooverOverElement(By by){
        WebElement element=driver.findElement(by);
        Actions actions= new Actions(driver);
        actions.moveToElement(element).perform();
        clickOnElement(By.xpath("//div/ul[@class='top-menu notmobile']/li[2]/ul[1]/li[1]"));

    }
    //method to pass the value
    public void sendValue(By by, String value){
        WebElement element=driver.findElement(by);
        element.sendKeys(value);

    }

    //method to get the text from element
    public  String getTextFromElement(By by){
        WebElement element = driver.findElement(by);
        return element.getText();
    }

    //selecting from dropdown using visible text
    public static void selectByVisibleText(By by, String txt){
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(txt);

    }
    //selecting from drop down using value of the displayed text or number
    public static void selectByValue(By by, String txt){
        Select select = new Select(driver.findElement(by));
        select.selectByValue(txt);
    }
    //method to take screenshot and store into given folder
    public void screenShot(String filename){
        //Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot =((TakesScreenshot)driver);
        //Call getScreenshotAs method to create image file
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        //Copy file at destination
        try {
            FileUtils.copyFile(SrcFile, new File("src/ScreenShots/"+filename+timeStamp+".png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //method to return the locator of the firstName
    public WebElement firstName(){
        return driver.findElement(By.id("FirstName"));
    }
    //find element
    public WebElement findElement(By by){
        return driver.findElement(by);
    }
    public WebElement click(By by){
        return driver.findElement(by);
    }


    public void setEmailAddress(Date date){
        //instantiate the dateformat and declare the format
        DateFormat dateFormat = new SimpleDateFormat("yyyyddmmhhmmss");
         //storing date
        this.date=date;
        //storing dateformat in timestamp variable
        this.timeStamp=dateFormat.format(date);
        //formed the email address and stored in email variable
        this.email=loadProperty.getValue("emailPart1")+timeStamp+loadProperty.getValue("emailPart2");
    }

    //email return method
    public String getEmailAddress(){
        return email;
    }

}
