package com.bank.steps;

import com.bank.pages.CustomerLoginPage;
import com.bank.pages.CustomersPage;
import com.bank.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginLogoutSteps {
    @When("I click on Customer Login tab")
    public void iClickOnCustomerLoginTab() {
        new HomePage().clickOnCustomerLogin();
    }
    @And("Search customer that you created in first test")
    public void searchCustomerThatYouCreatedInFirstTest() {
        new CustomerLoginPage().selectCustomerDropDown();
    }

    @And("click on Login button")
    public void clickOnLoginButton() {
        new CustomerLoginPage().clickOnLoginButton();
    }

    @Then("I verify LogOut tab is displayed")
    public void iVerifyLogOutTabIsDisplayed() {
    }

    @And("I click on LogOut")
    public void iClickOnLogOut() {
        new CustomersPage().clickOnLogOutButton();
    }

    @Then("verify Your Name text is displayed")
    public void verifyYourNameTextIsDisplayed() {
        Assert.assertEquals(new CustomersPage().verifyYourNameText(),"Your Name :","Mismatch");
    }

}
