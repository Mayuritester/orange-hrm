package com.orangehrmlive.pages;

import com.orangehrmlive.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ViewSystemUserPage extends Utility {
    // Username Field, User Roll dropDown, Employee Name Field,
    By systemUserText = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/h5[1]");
    By userRollDropDown = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]");
    By adminOption = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]");
    By employeeNameField = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/input[1]");
    By username = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]");
    By disableStatus = By.xpath("//div[contains(text(),'Disabled')]");
    By searchBatton = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/button[2]");
    By userList = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]");
    By checkBox = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]/i[1]");
    By delectBox = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/button[1]/i[1]");
    By popupOK = By.xpath("//body/div[@id='app']/div[3]/div[1]/div[1]/div[1]/div[3]/button[2]/i[1]");
    By successfullyyDeletedText = By.xpath("//div[@id='oxd-toaster_1']");
    By noRecordFond = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]");

    public String verifySystemUser() {
        return getTextFromElement(systemUserText);
    }

    public void enterUserName() {
        sendTextToElement(username, "Payal");
    }

    public void selectUserRole() {
        clickOnElement(userRollDropDown);
    }

    //
    public void selectStatus() {
        WebElement dropdown = driver.findElement(userRollDropDown);
        dropdown.click();

        // Locate all the options in the dropdown
        List<WebElement> options = driver.findElements(disableStatus);

        // Loop through the options to find the one you want
        for (WebElement option : options) {
            if (option.getText().equals("Disable")) {
                option.click(); // Click the desired option
                break;
            }


        }
    }

    public void clickSearch (){
        clickOnElement(searchBatton);
    }
    public String verifyUserlist () {
        return getTextFromElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]"));
    }

    public void clickCheckBox (){
        clickOnElement(checkBox);
    }

    public void clickDelete (){
        clickOnElement(delectBox);
    }
    public void clickOkDelete (){
        clickOnElement(popupOK);
    }
    public String verifySuccessfullyDeletedText (){
        return getTextFromElement(successfullyyDeletedText);
    }
public String verifyNoRecordsFound (){
        return getTextFromElement();
}
}


