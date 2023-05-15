package org.PageClassPackage;

import org.BaseClassPackage.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BaseClass {
    @FindBy(xpath = "//input[@id=\"ap_email\"]")
    WebElement username;
    @FindBy(xpath = "//input[@id=\"continue\"]")
    WebElement conti;
    @FindBy(xpath = "//a[@id=\"createAccountSubmit\"]")
    WebElement createAcc;
    @FindBy(xpath = "//*[@id=\"authportal-main-section\"]/div[2]/div/div[1]/form/div/div/div/div[3]/div/a/span")
    WebElement needHelp;
    public SignInPage()
    {
        PageFactory.initElements(driver, this);
    }
    public String signInPageTitle()
    {
        return driver.getTitle();
    }
    public boolean validateContinue()
    {
       return conti.isDisplayed();
    }
    public boolean validateCreateAccount()
    {
        return createAcc.isDisplayed();
    }
    public boolean validateNeedHelp()
    {
        return needHelp.isDisplayed();
    }
    public SignInPage1 validateSign1(String number)
    {
        username.sendKeys("number");
        conti.click();
        return new SignInPage1();
    }










}
