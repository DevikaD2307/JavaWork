package org.PageClassPackage;

import org.BaseClassPackage.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass
{
    @FindBy(id="nav-logo-sprites")
    WebElement logo;
    @FindBy(xpath = "//*[@id=\"icp-nav-flyout\"]/span/span[2]/span[1]")
    WebElement flag;
    @FindBy(xpath = "//*[@id=\"nav-cart-count-container\"]/span[2]")
    WebElement carticon;
    @FindBy(id="nav-link-accountList")
    WebElement signin;

    public HomePage()
    {
        PageFactory.initElements(driver, this);
    }

public String validateHomePageTitle()
{
    return  driver.getTitle();
}
public boolean validateLogo()
{
    return logo.isDisplayed();
}
public boolean validateFlag()
{
    return flag.isDisplayed();
}
public boolean validateCartIcon()
{
    return carticon.isDisplayed();
}
public SignInPage validateSignIn()
{
    signin.click();
    return new SignInPage();
}
}
