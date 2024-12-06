package com.orangehrmlive.pages;

import com.orangehrmlive.utilities.Utility;
import org.openqa.selenium.By;

public class Homepage extends Utility {


    By searchfield = By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/div[1]/div[1]/input[1]");
    By adminOption = By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]/span[1]");
    By pimOption = By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]/span[1]");
    By leaveOption = By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[3]/a[1]");
    By dashboardOption = By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[8]/a[1]");
    By logOut = By.xpath("//a[contains(text(),'Logout')]");

    public void clickOnadmin (){
       clickOnElement(searchfield);
    }
    public void clickOnPIMO (){
        clickOnElement(pimOption);
    }

    public void clickOnLeave (){
        clickOnElement(leaveOption);
    }

    public void clickOnAdmin (){
        clickOnElement(adminOption);
    }

    public void clickOnDashboard (){
        clickOnElement(dashboardOption);
    }

    public String verifyLogout (){
       return getTextFromElement(logOut);
    }
}
