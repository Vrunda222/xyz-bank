package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CustomersPage extends Utility {
    private static final Logger log = LogManager.getLogger(CustomersPage.class.getName());

    //Locators

    // verify "Logout" Tab displayed
    @CacheLookup
    @FindBy(linkText = "Logout")
    WebElement logOutText;

    //logout botton
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Logout']")
    WebElement logOutButton;

    // verify "Your Name" text displayed.
    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Your Name :']")
    WebElement yourNameText;


    //Methods
    // verify "Logout" Tab displayed
    private String verifyLogoutText(){
        log.info("verify text"+logOutText.toString());
        return getTextFromElement(logOutText);
    }

    //Click on logout
    public void clickOnLogOutButton(){
        clickOnElement(logOutButton);
        log.info("Click on button"+logOutButton.toString());
    }

    // verify "Your Name" text displayed.
    public String verifyYourNameText(){
        log.info("verify text"+yourNameText.toString());
        return getTextFromElement(yourNameText);
    }
}
