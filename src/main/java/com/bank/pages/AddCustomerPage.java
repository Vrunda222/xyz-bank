package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AddCustomerPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    //add first name
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstName;

    //add last name
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastName;

    //add post code
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement postCode;

    //add customer button
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement addCustomerButton;

    //Open Account Button
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Open Account']")
    WebElement openAccountButton;

    public void enterFirstName(String name) {
        sendTextToElement(firstName, name);
    }

    public void enterLastName(String name) {
        sendTextToElement(lastName, name);
    }

    public void enterPostCode(String code) {
        sendTextToElement(postCode, code);
    }

    public void clickAddCustomerButton() {
        clickOnElement(addCustomerButton);
    }

    public void checkPopUpMessage(String message) {
        Alert alert = driver.switchTo().alert(); //creating alert object reference and switch to alert
        String textFromAlert = alert.getText(); //getting the text from alert
        Boolean bool = textFromAlert.contains(message);
        Reporter.log("Check Pop Up message Pass or Fail:  " + bool);
    }

    public void clickOnOkButtonInPopUp() {
        Alert alert = driver.switchTo().alert(); //creating alert object reference and switch to alert
        alert.accept(); //accepting the alert (clicking on OK button)
    }

    public void clickOpenAccountButton() {
        clickOnElement(openAccountButton);
    }
}
