package com.orangehrmlive.pages;

import com.orangehrmlive.utilities.Utility;
import org.openqa.selenium.By;

public class DashboardPage extends Utility {

//    Dashboard text Locator
//    and create appropriate methods for it.

    By dashbaordText = By.xpath("//header/div[1]/div[1]/span[1]/h6[1]");

    public String getDashBoardText (){
        return getTextFromElement(dashbaordText);
    }


}
