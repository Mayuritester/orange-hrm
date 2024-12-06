package com.orangehrmlive.testsuite;

import com.google.common.base.Verify;
import com.orangehrmlive.pages.*;
import com.orangehrmlive.testbase.BaseTest;
import com.sun.tools.javac.comp.Check;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import sun.tools.jconsole.Tab;

import javax.swing.*;

public class UserTest extends BaseTest {
    private static final Logger log = LoggerFactory.getLogger(UserTest.class);
    LoginPage loginpage = new LoginPage();
    Homepage homepage = new Homepage();
    ViewSystemUserPage viewSystemUserPage = new ViewSystemUserPage();
    AddUserPage addUserPage = new AddUserPage();
    AdminPage adminPage = new AdminPage();


    @Test
    public void adminShouldAddUserSuccessFully() {
//    Login to Application
        loginpage.enterUserName();
        loginpage.enterPassword();
        loginpage.clickOnLogInButton();
//    click On "Admin" Tab
        homepage.clickOnAdmin();
//    Verify "System Users" Text
        Assert.assertEquals(viewSystemUserPage.verifySystemUser(), "System Users", "Message not displayed");
//    click On "Add" button
        adminPage.clickOnAdd();
//    Verify "Add User" Text
        Assert.assertEquals(addUserPage.addUserText(), "Add User", "Message not displayed");
//    Select User Role "Admin"
        // addUserPage.clickOnDropDown();
        // addUserPage.selectAdminFromDropDown();
//    enter Employee Name "Ravi M B"
        addUserPage.enterEmployeeName();
//    enter Username
        addUserPage.enterUserName();
//    Select status "Disable"
        //  addUserPage.selectStatusDisable();
        // addUserPage.disableOption();
//    enter psaaword
        addUserPage.enterPassword();
//    enter Confirm Password
        addUserPage.enterConfirmPassword();
//    click On "Save" Button
        addUserPage.clickOnSave();
//    verify message "Successfully Saved"
        Assert.assertEquals(addUserPage.verifySuccessfullySaved(), "Successfully Saved", "Not saved");
    }

    @Test

    public void searchTheUserCreatedAndVerifyIt() {
//       Login to Application
        loginpage.enterUserName();
        loginpage.enterPassword();
        loginpage.clickOnLogInButton();
//       click On "Admin" Tab
        homepage.clickOnAdmin();
//       Verify "System Users" Text
        Assert.assertEquals(viewSystemUserPage.verifySystemUser(), "System Users", "Incorrect page");
//       Enter Username
        viewSystemUserPage.enterUserName();
//       Select User Role

        viewSystemUserPage.selectUserRole();

        viewSystemUserPage.clickOnAdmin();
//       Select Satatus
        viewSystemUserPage.selectStatus();

//       Click on "Search" Button
        viewSystemUserPage.clickSearch();
//       Verify the User should be in Result list.


    }

    public void verifyThatAdminShouldDeleteTheUserSuccessFully() {
//        Login to Application
        loginpage.enterUserName();
        loginpage.enterPassword();
        loginpage.clickOnLogInButton();
//        click On "Admin" Tab
        homepage.clickOnAdmin();
//        Verify "System Users" Text
        Assert.assertEquals(viewSystemUserPage.verifySystemUser(), "System Users", "Incorrect page");
//        Enter Username
        viewSystemUserPage.enterUserName();
//        Select User Role

//        Select Satatus

//        Click on "Search" Button
        viewSystemUserPage.clickSearch();
//        Verify the User should be in Result list.
         Assert.assertEquals(viewSystemUserPage.verifyUserlist(), "Admin", "not on admin list");
//        Click on Check box
viewSystemUserPage.clickCheckBox();
//        Click on Delete Button
viewSystemUserPage.clickDelete();

//        Click on Ok Button on Popup
viewSystemUserPage.clickOkDelete();
//        verify message "Successfully Deleted"
      Assert.assertEquals(viewSystemUserPage.verifySuccessfullyDeletedText(),"Successfully Deleted", "Not deleted");
    }

    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound (){
//    Login to Application
        loginpage.enterUserName();
        loginpage.enterPassword();
        loginpage.clickOnLogInButton();
//    click On "Admin" Tab
        homepage.clickOnAdmin();
//    Verify "System Users" Text
        Assert.assertEquals(viewSystemUserPage.verifySystemUser(), "System Users", "Incorrect page");
//    Enter Username
        viewSystemUserPage.enterUserName();
//    Select User Role

//    Select Satatus

//    Click on "Search" Button
        viewSystemUserPage.clickSearch();
//    verify message "No Records Found"
     Assert.assertEquals(viewSystemUserPage.verifyNoRecordsFound(),"No Record Found", "Incorrect text" );
}}