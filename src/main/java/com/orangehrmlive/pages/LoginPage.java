package com.orangehrmlive.pages;

import com.orangehrmlive.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    //    Store username// password, Login Button, HR for All logo, and LOGIN Panel text Locators

    By usernameField = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]");
    By passwordfield = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]");
    By loginButtom = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]");
    By hrAllLogi = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/img[1]");
    By userNameText = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/p[1]");
    By passwordText = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/p[2]");

     public void enterUserName (){
         sendTextToElement(usernameField, "Admin");
     }

     public void enterPassword (){
         sendTextToElement(passwordfield,"admin123");
     }

     public void clickOnLogInButton (){
         clickOnElement(loginButtom);
     }
     public String verifyLogoOfHR (){
        return getTextFromElement(hrAllLogi);
     }




}
