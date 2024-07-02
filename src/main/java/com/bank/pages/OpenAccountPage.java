package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class OpenAccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    //select customer
    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement customerFromDropdown;

    //select currency
    @CacheLookup
    @FindBy(id = "currency")
    WebElement currencyFromDropdown;

    //Process Button
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Process']")
    WebElement processButton;

    public void searchCustomerFromDropdown(String name) {
        selectByVisibleTextFromDropDown(customerFromDropdown, name);
    }

    public void searchCurrencyFromDropdown(String currency) {
        selectByValueFromDropDown(currencyFromDropdown, currency);
    }

    public void clickOnProcessButton() {
        clickOnElement(processButton);
    }

}
