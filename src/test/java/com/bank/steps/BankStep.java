package com.bank.steps;

import com.bank.pages.AddCustomerPage;
import com.bank.pages.BankManagerLoginPage;
import com.bank.pages.HomePage;
import com.bank.pages.OpenAccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BankStep {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I click On Bank Manager Login Tab")
    public void iClickOnBankManagerLoginTab() {
        new HomePage().clickOnBankManagerLoginButton();
    }

    @Then("I navigate to manager page")
    public void iNavigateToManagerPage() {
    }

    @And("I click On Add Customer Tab")
    public void iClickOnAddCustomerTab() {
        new BankManagerLoginPage().clickOnAddCustomerButton();
    }

    @And("I enter FirstName {string}")
    public void iEnterFirstName(String firstname) {
        new AddCustomerPage().enterFirstName(firstname);
    }

    @And("I enter LastName {string}")
    public void iEnterLastName(String lastname) {
        new AddCustomerPage().enterLastName(lastname);
    }

    @And("I enter PostCode {string}")
    public void iEnterPostCode(String postcode) {
        new AddCustomerPage().enterPostCode(postcode);
    }

    @And("I click On Add Customer Button")
    public void iClickOnAddCustomerButton() {
        new AddCustomerPage().clickAddCustomerButton();
    }

    @Then("I should see popup")
    public void iShouldSeePopup() {
    }

    @And("I verify message {string}")
    public void iVerifyMessage(String message) {
        new AddCustomerPage().checkPopUpMessage(message);
    }

    @Then("I click on ok button on popup")
    public void iClickOnOkButtonOnPopup() {
        new AddCustomerPage().clickOnOkButtonInPopUp();
    }

    @And("I click On Open Account Tab")
    public void iClickOnOpenAccountTab() {
        new AddCustomerPage().clickOpenAccountButton();
    }

    @And("I Search customer that created in first test {string}")
    public void iSearchCustomerThatCreatedInFirstTest(String firstname) {
        new OpenAccountPage().searchCustomerFromDropdown(firstname);
    }

    @And("I Select currency {string}")
    public void iSelectCurrency(String currency) {
        new OpenAccountPage().searchCurrencyFromDropdown(currency);
    }

    @And("I click on process button")
    public void iClickOnProcessButton() {
        new OpenAccountPage().clickOnProcessButton();
    }

}
