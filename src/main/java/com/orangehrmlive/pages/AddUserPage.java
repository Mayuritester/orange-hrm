package com.orangehrmlive.pages;

import com.orangehrmlive.utilities.Utility;
import org.openqa.selenium.By;

public class AddUserPage extends Utility {

//    User Role Drop Down, Employee Name, Username, Status Drop Down, Password, Confirm Password,
//    Save and Cancel Button Locators and it's actions

    By userRollDropDown = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]");
    By employeeName = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]");
    By adminOption = By.linkText("admin");
    By usernameField = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/input[1]");
    By statusDropDown = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]");
    By disableOption = By.xpath("//div[contains(text(),'Disabled')]");
    By passwordField = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]");
    By confirmPassword = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]");
    By saveButton = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[2]");
    By cancelButton = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]");
    By addUserText = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/h6[1]");
    By succeddfullySavedText = By.linkText("Seccussfully Saved");

    public String addUserText (){
        return getTextFromElement(addUserText);

}
    public void clickOnDropDown (){
        clickOnElement(userRollDropDown);

    }
    public void selectAdminFromDropDown (){
        clickOnElement(adminOption);

    }
    public void enterEmployeeName (){
        sendTextToElement(employeeName,"Ravi M B");
    }

    public void enterUserName (){
        sendTextToElement(usernameField, "Ananya");
    }

    public void selectStatusDisable () {
        clickOnElement(statusDropDown);
    }
        public void disableOption () {
            clickOnElement(disableOption);
        }


    public void enterPassword (){
        sendTextToElement(passwordField,"Prime123");
    }

    public void enterConfirmPassword (){
        sendTextToElement(confirmPassword,"Prime123");
    }

    public void clickOnSave (){
        clickOnElement(saveButton);
    }

    public String verifySuccessfullySaved (){
        return getTextFromElement(succeddfullySavedText);
    }

}
