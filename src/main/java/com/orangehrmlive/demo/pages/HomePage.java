package com.orangehrmlive.demo.pages;


import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import static com.orangehrmlive.demo.driverfactory.ManageDriver.driver;


public class HomePage extends Utility {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//body/div[@id='wrapper']/div[@id='branding']/a[1]/img[1]")
    WebElement OrangeHRMlogo;
    @FindBy(xpath = "//b[contains(text(),'Admin')]")
    WebElement Admin;
    @FindBy(xpath = "//b[contains(text(),'PIM')]")
    WebElement PIM;
    @FindBy(xpath = "//b[contains(text(),'Leave')]")
    WebElement Leave;
    @FindBy(xpath = "//b[contains(text(),'Dashboard')]")
    WebElement Dashboard;
    @FindBy(xpath = "//a[@id='welcome']")
    WebElement WelcomeText;
    @FindBy(xpath = "//a[contains(text(),'Logout')]")
    WebElement Logout;

    public String getverifyOrangeHRMlogoText() {
        Reporter.log("getverify OrangeHRMlogo Text" + OrangeHRMlogo.toString());
        return getTextFromElement(OrangeHRMlogo);
    }

    public void clickOnOrangeHRMlogo() {
        clickOnElement(OrangeHRMlogo);
    }

    public void clickOnAdmin() {
        clickOnElement(Admin);
    }

    public void clickOnPIM() {
        clickOnElement(PIM);
    }

    public void clickOnLeave() {
        clickOnElement(Leave);
    }

    public void clickOnDashboard() {
        clickOnElement(Dashboard);
    }

    public String getverifyWelcomeText() {
        return getTextFromElement(WelcomeText);
    }

    public void clickOnLogout() {
        clickOnElement(WelcomeText);
        clickOnElement(Logout);
    }
}
