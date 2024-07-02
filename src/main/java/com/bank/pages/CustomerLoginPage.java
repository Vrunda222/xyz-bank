package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CustomerLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(CustomerLoginPage.class.getName());

    //Locators
    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement searchCustomerDropDown;

    //login botton
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement loginButton;

    //Methods
    public void selectCustomerDropDown(){
        selectByVisibleTextFromDropDown(searchCustomerDropDown,"Hermoine Granger");
        log.info("search dropdown"+searchCustomerDropDown.toString());
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
        log.info("Click on button"+loginButton.toString());
    }
}
