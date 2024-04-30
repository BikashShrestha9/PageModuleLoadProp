package org.example;

import org.openqa.selenium.By;

public class LogInPage extends Utility {
    HomePage homePage=new HomePage();
    LoadProperty loadProperty=new LoadProperty();
    public void enterLoginDetails(){

        sendValue(By.id("Email"), email);
        sendValue(By.id("Password"), loadProperty.getValue("password"));
        clickOnElement(By.xpath("//button[@class ='button-1 login-button']"));
    }
}
