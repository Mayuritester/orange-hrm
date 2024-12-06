package com.orangehrmlive.testbase;

import com.orangehrmlive.propertyreader.Propertyreader;
import com.orangehrmlive.utilities.Utility;
import org.testng.annotations.BeforeMethod;



public class BaseTest extends Utility {

    String browser = Propertyreader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setup (){
        selectBrowser(browser);


        
    }


    //    @AfterMethod
//    public void tearDown (){
//        closeBrowser();
//
//    }
}
