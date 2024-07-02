package com.bank.steps;

import com.bank.pages.AccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class DepositSteps {
    @And("click on Deposit")
    public void clickOnDeposit() {
        new AccountPage().clickOnDeposit();
    }

    @And("enter amount one hundred")
    public void enterAmountOneHundred() {
        new AccountPage().enterAmount();
    }

    @And("click on Deposit button")
    public void clickOnDepositButton() {
        new AccountPage().clickOnDepositButton();
    }

    @Then("I verify Deposit successful")
    public void iVerifyDepositSuccessful() {
        Assert.assertEquals(new AccountPage().verifyDepositMsg(),"Deposit Successful","Mismatch");
    }


}
