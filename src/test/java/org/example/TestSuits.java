package org.example;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Date;

public class TestSuits extends BaseTest{
BrowserManager browserManager=new BrowserManager();
HomePage homePage=new HomePage();
LogInPage logInPage=new LogInPage();
RegistrationValues registrationValues=new RegistrationValues();
RegistrationVerifyPage regverify= new RegistrationVerifyPage();
CameraAndPhotoPage cameraAndPhotoPage=new CameraAndPhotoPage();
LeciaCameraPage leciaCameraPage=new LeciaCameraPage();
ProductMailToFriendPage productMailToFriendPage=new ProductMailToFriendPage();
BuildOwnComputerPage buildOwnComputerPage=new BuildOwnComputerPage();

    @Test(priority = 1)
    public void verifyUserShouldAbleToRegister(){
        //setEmailAddress(new Date());
        //opening registration page
        homePage.registerPage();
        //passing the registration details
        registrationValues.registrationDetails();
        //clicking on registration button
        clickOnElement(By.id("register-button"));
        //verifying successful registration
        regverify.verifySuccessfulRegistration();
    }

    @Test(priority = 2)
    public void userShouldBeAbleToLogin(){
        homePage.registerPage();
        //passing the registration details
        registrationValues.registrationDetails();
        //clicking on registration button
        clickOnElement(By.id("register-button"));
        //verifying successful registration
        regverify.verifySuccessfulRegistration();
        //clicking on login button
        homePage.loginPage();
        //passing log in details
        logInPage.enterLoginDetails();

    }
    @Test(priority = 4)
    public void referAProductToFriend(){
        //opening registration page
        homePage.registerPage();
        //passing registration details
        registrationValues.registrationDetails();
        //clicking on registration button
        clickOnElement(By.id("register-button"));
        // verifying registration is successfull
        regverify.verifySuccessfulRegistration();
        //opening camera and photo page
        homePage.cameraAndPhotoPage();
        //opening referring camera lecia t mirror page
        cameraAndPhotoPage.leciaTMirrorlessCamera();
        //referring friend with email address
        leciaCameraPage.emailAFriend();
        //passing msg
        productMailToFriendPage.enterFriendEmailAndPersonalMsg();
    }
    @Test(priority = 3)
    public void buildComputer(){
        //opening building your own computer page
        homePage.buildComputer();
        //selecting computer parts
        buildOwnComputerPage.selectComputerParts();

    }


}
