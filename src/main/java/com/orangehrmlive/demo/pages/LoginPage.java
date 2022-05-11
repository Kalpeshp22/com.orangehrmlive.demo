package com.orangehrmlive.demo.pages;


import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.orangehrmlive.demo.driverfactory.ManageDriver.driver;

/**
 * Created by Jay Vaghani
 */
public class LoginPage extends Utility {

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='txtUsername']")
    WebElement userName;
    @FindBy(xpath = "//input[@id='txtPassword']")
    WebElement addPass;
    @FindBy(xpath = "//input[@id='btnLogin']")
    WebElement login;
    @FindBy(xpath = "//a[@id='welcome']")
    WebElement welcome;
    @FindBy(xpath = "//b[normalize-space()='Admin']")
    WebElement admin;
    @FindBy(xpath = "//div[@class='head']//h1")
    WebElement systemUser;
    @FindBy(xpath = "//input[@id='btnAdd']")
    WebElement addButton;
    @FindBy(xpath = "//h1[@id='UserHeading']")
    WebElement addUser;
    @FindBy(xpath = "//select[@id='systemUser_userType']")
    WebElement userRole;
    @FindBy(xpath = "//input[@id='systemUser_employeeName_empName']")
    WebElement employeeName;
    @FindBy(xpath = "//input[@id='systemUser_userName']")
    WebElement userNam;
    @FindBy(xpath = "//select[@id='systemUser_status']")
    WebElement status;
    @FindBy(xpath = "//input[@id='systemUser_password']")
    WebElement passWord;
    @FindBy(xpath = "//input[@id='systemUser_confirmPassword']")
    WebElement confirmPass;
    @FindBy(xpath = "//input[@id='btnSave']")
    WebElement saveButton;

    public void enterUser(String user) {
        sendTextToElement(userName, user);
    }

    public void enterPass(String pass) {
        sendTextToElement(addPass, pass);
    }

    public void clickOnLogIn() {
        clickOnElement(login);
    }
    public String verifyWelcome(){
        return getTextFromElement(welcome);
    }
    public void clickOnAdmin() {
        clickOnElement(admin);
    }

    public String verifysystemUser() {
        return getTextFromElement(systemUser);
    }
    public void clickOnAdd(){
        clickOnElement(addButton);
    }
    public String verifyAddUser(){
        return getTextFromElement(addUser);
    }
    public void selectUserRole(String role){
        sendTextToElement(userRole,role);
    }
    public void enterEmployeeName(String name){
        sendTextToElement(employeeName,name);
    }
    public void enterUserName(String name){
        sendTextToElement(userNam,name);
    }
    public void selectStatus(String stat){
        sendTextToElement(status,stat);
    }
    public void enterPassWord(String pass){
        sendTextToElement(passWord,pass);
    }
    public void enterConfirmPass(String confirm){
        sendTextToElement(confirmPass,confirm);
    }
    public void clickOnSave(){
        clickOnElement(saveButton);
    }

}





