package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ViewSystemUsersPage extends Utility {
    public ViewSystemUsersPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h1[contains(text(),'System Users')]")
    WebElement SystemUsersText;
    @FindBy(id = "searchSystemUser_userName")
    WebElement username;
    @FindBy(id = "//select[@id='searchSystemUser_userType']")
    WebElement UserRolldropDown;
    @FindBy(xpath = "//input[@id='searchSystemUser_employeeName_empName']")
    WebElement EmployeeNameField;
    @FindBy(xpath = "//select[@id='searchSystemUser_status']")
    WebElement StatusDropDown;
    @FindBy(id = "searchBtn")
    WebElement SearchButton;
    @FindBy(id = "resetBtn")
    WebElement ResetButton;
    @FindBy(id = "btnAdd")
    WebElement AddButton;
    @FindBy(id = "btnDelete")
    WebElement DeleteButton;
    @FindBy (xpath = "//thead/tr[1]/th[1]")
    WebElement Checkbox;
    @FindBy(xpath = "//input[@id='dialogDeleteBtn']")
    WebElement OkButtononPopup;
    @FindBy(xpath = "//td[contains(text(),'No Records Found')]")
    WebElement NoRecord;


    public String getverifySystemUsersText(){
        Reporter.log("getverify SystemUsers Text" + SystemUsersText.toString());
        return getTextFromElement(SystemUsersText);
    }
    public void enterUsernameField(String Username){
        sendTextToElement(username,Username);
    }
    public void selectUserRole(int index)
    {
        selectByIndexFromDropDown(UserRolldropDown, index);
    }
    public void enterEmployeeName(String EmployeeName)
    {
        sendTextToElement(EmployeeNameField, EmployeeName);
    }
    public void selectStatus(int index1)
    {
        selectByIndexFromDropDown(StatusDropDown, index1);
    }
    public void clickSearchbutton()
    {
        clickOnElement(SearchButton);
    }
    public void clickResetbutton()
    {
        clickOnElement(ResetButton);
    }
    public void clickAddbutton()
    {
        clickOnElement(AddButton);
    }
    public void clickDeletebutton() {clickOnElement(DeleteButton);}
    public void clickCheckbox() {clickOnElement(Checkbox);}
    public void clickOkButtononPopup() {clickOnElement(OkButtononPopup);}
    public String getverifyNoRecordText(){
        return getTextFromElement(NoRecord);
    }

}