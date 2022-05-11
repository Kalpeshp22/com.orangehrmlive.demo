package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AdminPage extends Utility {
    public AdminPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//b[contains(text(),'Admin')]")
    WebElement Admin;
    @FindBy(id = "menu_admin_UserManagement")
    WebElement UserManagement;
    @FindBy(id = "menu_admin_Job")
    WebElement Job;
    @FindBy(id = "menu_admin_Organization")
    WebElement OrganizationTab;

    public void clickOnAdmin(){
        Reporter.log("click On Admin" + Admin.toString());
        clickOnElement(Admin);
    }
    public void clickOnUserManagement(){
        clickOnElement(UserManagement);
    }
    public void clickOnJob(){
        clickOnElement(Job);
    }
    public void clickOnOrganizationTab(){
        clickOnElement(OrganizationTab);
    }
}

