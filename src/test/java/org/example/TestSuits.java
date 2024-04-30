package org.example;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestSuits extends BaseTest{
BrowserManager browserManager=new BrowserManager();
HomePage homePage=new HomePage();
LogInPage logInPage=new LogInPage();
RegistrationValues registrationValues=new RegistrationValues();
RegistrationVerifyPage regverify= new RegistrationVerifyPage();
CameraAndPhotoPage cameraAndPhotoPage=new CameraAndPhotoPage();
LeciaCameraPage leciaCameraPage=new LeciaCameraPage();
ProductMailToFriendPage productMailToFriendPage=new ProductMailToFriendPage();

    @Test(priority = 3)
    public void verifyUserShouldAbleToRegister(){
        homePage.registerPage();
        registrationValues.registrationDetails();
        clickOnElement(By.id("register-button"));
        regverify.verifySuccessfulRegistration();
    }

    @Test
    public void userShouldBeAbleToLogin(){
        homePage.loginPage();;
        logInPage.enterLoginDetails();

    }
    @Test(priority = 2)
    public void referAProductToFriend(){
        homePage.registerPage();
        registrationValues.registrationDetails();
        clickOnElement(By.id("register-button"));
        regverify.verifySuccessfulRegistration();
        homePage.loginPage();;
        logInPage.enterLoginDetails();
        homePage.cameraAndPhotoPage();
        cameraAndPhotoPage.leciaTMirrorlessCamera();
        leciaCameraPage.emailAFriend();
        productMailToFriendPage.enterFriendEmailAndPersonalMsg();
    }
}
