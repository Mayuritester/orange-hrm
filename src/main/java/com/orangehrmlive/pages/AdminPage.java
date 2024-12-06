package com.orangehrmlive.pages;

import com.orangehrmlive.utilities.Utility;
import org.openqa.selenium.By;

public class AdminPage extends Utility {

//    UserManagement, Job, Organization Tabs Locators and it's actions

    By UserManagement = By.xpath("//header/div[2]/nav[1]/ul[1]/li[1]/span[1]");
    By Job = By.xpath("//header/div[2]/nav[1]/ul[1]/li[2]/span[1]");
    By Ozganixation = By.xpath("//header/div[2]/nav[1]/ul[1]/li[3]/span[1]/i[1]");
    By addButton = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[1]");

    public void clickOnAdd(){
        clickOnElement(addButton);
    }

}




