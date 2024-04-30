package org.example;

import org.openqa.selenium.By;

public class ProductMailToFriendPage extends Utility {

    public void enterFriendEmailAndPersonalMsg(){
        sendValue(By.id("FriendEmail"), loadProperty.getValue("friendEmail"));
        sendValue(By.id("PersonalMessage"), loadProperty.getValue("personalMsg"));
        clickOnElement(By.xpath("//div[2][@class='buttons']/button[1]"));
    }

}
