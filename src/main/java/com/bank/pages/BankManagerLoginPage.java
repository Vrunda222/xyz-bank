package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BankManagerLoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    //add customer button
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add Customer']")
    WebElement addCustomerButton;

    public void clickOnAddCustomerButton(){
        clickOnElement(addCustomerButton);
    }
}
