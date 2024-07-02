package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    //locators
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Customer Login']")
    WebElement customerlogin;

    //bank manager login button
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Bank Manager Login']")
    WebElement bankManagerLoginButton;

    public void clickOnBankManagerLoginButton(){
        clickOnElement(bankManagerLoginButton);
    }
    //click on "Customer Login" Tab
    public void clickOnCustomerLogin(){
        clickOnElement(customerlogin);
        log.info("Click on button"+customerlogin.toString());
    }

}
