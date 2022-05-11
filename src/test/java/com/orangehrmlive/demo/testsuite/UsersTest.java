package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.*;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * Created by Jay Vaghani
 */

public class UsersTest extends TestBase {

    LoginPage loginPage;
    AdminPage adminPage;
    ViewSystemUsersPage viewSystemUsersPage;
    AddUserPage addUserPage;


    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        loginPage = new LoginPage();
        adminPage = new AdminPage();
        viewSystemUsersPage = new ViewSystemUsersPage();
        addUserPage = new AddUserPage();

    }

    @Test(groups = {"sanity","regression"},priority = 0)
    public void adminShouldAddUserSuccessFully() {
        SoftAssert softAssert = new SoftAssert();
        //Login to Application
        loginPage.enterUserName("Admin");
        loginPage.enterPassWord("admin123");
        loginPage.clickOnLogIn();
        //click On "Admin" Tab
        adminPage.clickOnAdmin();
        //Verify "System Users" Text
        String actualMessage = viewSystemUsersPage.getverifySystemUsersText();
        Assert.assertEquals("System Users", actualMessage, "Message not found");
        //click On "Add" button
        addUserPage.clickAddUserbutton();
        //Verify "Add User" Text
        String actualMessage1 = addUserPage.getverifyAddUserText();
        Assert.assertEquals("Add User", actualMessage1, "Message not found");
        softAssert.assertAll();
        //Select User Role "Admin"
        addUserPage.SelectUserRole(1);
        //enter Employee Name "Ananya Dash"
        addUserPage.EnterEmployeeName("Ananya Dash");
        //enter Username
        addUserPage.EnterUserName("Admin15");
        //Select status "Disable"
        addUserPage.SelectUserStatus(0);
        //enter psaaword
        addUserPage.EnterPassword("admin123");
        //enter Confirm Password
        addUserPage.EnterConfirmPassword("admin123");
        //click On "Save" Button
        addUserPage.ClickSaveButton();
        //verify message "Successfully Saved"
    }

    @Test(groups = {"sanity","smoke","regression"},priority = 1)
    public void searchTheUserCreatedAndVerifyIt() {
        SoftAssert softAssert = new SoftAssert();
        //Login to Application
        loginPage.enterUserName("Admin");
        loginPage.enterPassWord("admin123");
        loginPage.clickOnLogIn();
        //click On "Admin" Tab
        adminPage.clickOnAdmin();
        //Verify "System Users" Text
        String actualMessage = viewSystemUsersPage.getverifySystemUsersText();
        Assert.assertEquals("System Users", actualMessage, "Message not found");
        //Enter Username
        viewSystemUsersPage.enterUsernameField("Admin12");
        //Select User Role
        viewSystemUsersPage.selectUserRole(2);
        //Select Satatus
        viewSystemUsersPage.selectStatus(0);
        //Click on "Search" Button
        viewSystemUsersPage.clickSearchbutton();
        //Verify the User should be in Result list
        softAssert.assertAll();
    }

    @Test(groups = {"smoke","regression"},priority = 2)
    public void verifyThatAdminShouldDeleteTheUserSuccessFully() {
        //Login to Application
        loginPage.enterUserName("dia");
        loginPage.enterPassWord("Prime123");
        loginPage.clickOnLogIn();
        //click On "Admin" Tab
        adminPage.clickOnAdmin();
        //Verify "System Users" Text
        String actualMessage = viewSystemUsersPage.getverifySystemUsersText();
        Assert.assertEquals("System Users", actualMessage, "Message not found");
        //Enter Username
        viewSystemUsersPage.enterUsernameField("Akash");
        //Select User Role
        viewSystemUsersPage.selectUserRole(2);
        //Select Satatus
        viewSystemUsersPage.selectStatus(0);
        //Click on "Search" Button
        viewSystemUsersPage.clickSearchbutton();
        //Click on Check box
        viewSystemUsersPage.clickCheckbox();
        //Click on Delete Button
        viewSystemUsersPage.clickDeletebutton();
        //Popup will display
        //Click on Ok Button on Popup
        viewSystemUsersPage.clickOkButtononPopup();
        //verify message "Successfully Deleted
    }

    @Test(groups = {"regression"},priority = 3)
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound() {
        //Login to Application
        loginPage.enterUserName("Akash");
        loginPage.enterPassWord("prime123");
        loginPage.clickOnLogIn();
        //click On "Admin" Tab
        adminPage.clickOnAdmin();
        //Verify "System Users" Text
        String actualMessage = viewSystemUsersPage.getverifySystemUsersText();
        Assert.assertEquals("System Users", actualMessage, "Message not found");
        //Enter Username
        viewSystemUsersPage.enterUsernameField("Prime007");
        //Select User Role
        viewSystemUsersPage.selectUserRole(2);
        //Select Satatus
        viewSystemUsersPage.selectStatus(0);
        //Click on "Search" Button
        viewSystemUsersPage.clickSearchbutton();
        //verify message "No Records Found"
        String actualMessage1 = viewSystemUsersPage.getverifyNoRecordText();
        Assert.assertEquals("No Records Found", actualMessage1, "Message not found");
    }
}