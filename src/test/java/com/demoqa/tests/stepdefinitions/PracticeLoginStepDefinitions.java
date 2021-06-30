package com.demoqa.tests.stepdefinitions;

import com.demoqa.automation.interactions.OpenTheBrowser;
import com.demoqa.automation.tasks.LoginWithDataExcel;
import com.demoqa.automation.tasks.ValidationsForLoginWithDataExcel;
import com.demoqa.automation.ui.LoginPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
public class PracticeLoginStepDefinitions {

    @Given("^that a web user wants to practice login in DemoQA$")
    public void thatAWebUserWantsToPracticeLoginInDemoQA() {
        theActorInTheSpotlight().attemptsTo(OpenTheBrowser.on(LoginPage.URL));
    }

    @When("^he fills all the requested fields and he follows the steps using excel$")
    public void heFillsAllTheRequestedFieldsAndHeFollowsTheStepsUsingExcel() {
        theActorInTheSpotlight().attemptsTo(LoginWithDataExcel.dataExcel());
    }

    @Then("^he should see the correct validations with the excel$")
    public void heShouldSeeTheCorrectValidationsWithTheExcel() {
        theActorInTheSpotlight().attemptsTo(ValidationsForLoginWithDataExcel.validations());
    }

}
