package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationVerifyPage extends Utility {
    LoadProperty loadProperty=new LoadProperty();

    public void verifySuccessfulRegistration(){
        //actual message storing in the local variable
        String actualMsg=getTextFromElement(By.xpath("//div[@class='result']"));
        //comparing expected and actual message
        Assert.assertEquals(loadProperty.getValue("regVerifyMsg"),actualMsg, "You are not Register successfully");
    }

}
