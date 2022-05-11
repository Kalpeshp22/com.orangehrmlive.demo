package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import sun.security.util.Password;

public class AddUserPage extends Utility {
    public AddUserPage() {
            PageFactory.initElements(driver, this);
        }
        @FindBy(id = "btnAdd")
        WebElement Add;
        @FindBy(id = "systemUser_userType")
        WebElement UserRoleDropDown;
        @FindBy(id = "systemUser_employeeName_empName")
        WebElement EmployeeName;
        @FindBy(name = "systemUser[userName]")
        WebElement Username;
        @FindBy(xpath = "//select[@id='systemUser_status']")
        WebElement StatusDropDown;
        @FindBy(id = "systemUser_password")
        WebElement Passwordfield;
        @FindBy(id = "systemUser_confirmPassword")
        WebElement CPasswordfield;
        @FindBy(id = "btnSave")
        WebElement Savebutton;
        @FindBy(id = "btnCancel")
        WebElement Cancelbutton;
        @FindBy(xpath = "//h1[@id='UserHeading']")
        WebElement AddUserText;

        public void clickAddUserbutton ()
        {
            Reporter.log("click On AddUser" + Add.toString());
            clickOnElement(Add);
        }
        public void SelectUserRole ( int index)
        {
            selectByIndexFromDropDown(UserRoleDropDown, index);
        }
        public void EnterEmployeeName (String EName)
        {
            sendTextToElement(EmployeeName, EName);
        }
        public void EnterUserName (String UName)
        {
            sendTextToElement(Username, UName);
        }
        public void SelectUserStatus ( int index)
        {
            selectByIndexFromDropDown(StatusDropDown, index);
        }
        public void EnterPassword (String Password)
        {
            sendTextToElement(Passwordfield, Password);
        }
        public void EnterConfirmPassword (String Cpassword)
        {
            sendTextToElement(CPasswordfield, Cpassword);
        }
        public void ClickSaveButton ()
        {
            clickOnElement(Savebutton);
        }
        public void ClickCancelButton ()
        {
            clickOnElement(Cancelbutton);
        }
        public String getverifyAddUserText () {
            return getTextFromElement(AddUserText);
        }
    }


