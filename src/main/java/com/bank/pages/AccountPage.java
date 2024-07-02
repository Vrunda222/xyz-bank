package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(AccountPage.class);
    //locators-deposit
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Deposit']")
    WebElement deposit;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement amount;
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement depositButton;
    @CacheLookup
    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement verifyDepositMsg;


    //withdraw locators
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Withdrawl']")
    WebElement withdraw;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement amountW;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Withdraw']")
    WebElement withdrawButton;
    @CacheLookup
    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement verifyWithdrawMsg;


    //Methods
    //Deposit
    //click on "Deposit" Tab
    public void clickOnDeposit(){
        clickOnElement(deposit);
        log.info("Click on button"+deposit.toString());
    }

    //Enter amount 100
    public void enterAmount(){
        sendTextToElement(amount,"100");
        log.info("Click on button"+amount.toString());
    }

    //click on "Deposit" Button
    public void clickOnDepositButton(){
        clickOnElement(depositButton);
        log.info("Click on button"+depositButton.toString());
    }

    //verify message "Deposit Successful"
    public String verifyDepositMsg(){
        log.info("verify msg."+verifyDepositMsg.toString());
        return getTextFromElement(verifyDepositMsg);
    }

    //Withdraw
    public void clickOnWithdraw(){
        clickOnElement(withdraw);
        log.info("Click on button"+withdraw.toString());
    }
    public void withdrawAmount(){
        sendTextToElement(amountW,"10");
        log.info("Click on button"+amountW.toString());
    }
    public void clickOnWithdrawButton(){
        clickOnElement(withdrawButton);
        log.info("Click on button"+withdrawButton.toString());
    }
    //Verify message
    public String verifyWithdrawtMsg(){
        log.info("verify msg."+verifyWithdrawMsg.toString());
        return getTextFromElement(verifyDepositMsg);
    }
}
