package com.orangehrmlive.testsuite;

import com.orangehrmlive.pages.DashboardPage;
import com.orangehrmlive.pages.Homepage;
import com.orangehrmlive.pages.LoginPage;
import com.orangehrmlive.testbase.BaseTest;
import org.testng.Assert;

Homepage homepage = new Homepage();
DashboardPage dashboardPage = new DashboardPage();
LoginPage loginPage = new LoginPage();

public class LoginTest extends BaseTest {

    public void  verifyUserShouldLoginSuccessFully() {
//        Enter username
        loginPage.enterUserName();
//        Enter password
        loginPage.enterPassword();
//        Click on Login Button
        loginPage.clickOnLogInButton();
//        Verify "Dashboard" Message
        Assert.assertEquals(dashboardPage.getDashBoardText(),"Dashboard", "Not on Dashboard");
    }



public void  VerifyThatTheLogoDisplayOnLoginPage() {
//    Launch the application
    loginPage.enterUserName();
    loginPage.enterPassword();
    loginPage.clickOnLogInButton();
    Homepage homepage = new Homepage();

//    Verify Logo is Displayed
        Assert.assertEquals(loginPage.verifyLogoOfHR(),"HR logo","No logo display");

}
public void VerifyUserShouldLogOutSuccessFully() {
//    Login To The application
    loginPage.enterUserName();
    loginPage.enterPassword();
    loginPage.clickOnLogInButton();

//    Click on User Profile logo
    Assert.assertEquals(loginPage.verifyLogoOfHR(),"HR logo","No logo display");

//    Mouse hover on "Logout" and click
    Assert.assertEquals(homepage. verifyLogout(),"HR logo","No logo display");

//    Verify the text "Login Panel" is displayed
    
}
}
