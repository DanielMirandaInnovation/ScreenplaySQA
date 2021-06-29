package com.demoqa.tests.stepdefinitions;

import com.demoqa.automation.interactions.OpenTheBrowser;
import com.demoqa.automation.tasks.FillAllFields;
import com.demoqa.automation.tasks.FillAllFieldsValidations;
import com.demoqa.automation.ui.TextBoxPage;
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

public class AddWebTableStepDefinitions {

    @Managed
    private WebDriver driver;

    @Before
    public void actorSetUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Daniel").can(BrowseTheWeb.with(driver));
    }

    @Given("^that a web user wants to add a web table in DemoQA$")
    public void thatAWebUserWantsToAddAWebTableInDemoQA(){
        theActorInTheSpotlight().attemptsTo(OpenTheBrowser.on(TextBoxPage.URL));
    }


    @When("^he fills all the requested fields and he follows the steps$")
    public void heFillsAllTheRequestedFieldsAndHeFollowsTheSteps() {
        theActorInTheSpotlight().attemptsTo(FillAllFields.successful());
    }

    @Then("^he should see the web table created$")
    public void heShouldSeeTheWebTableCreated() {
        theActorInTheSpotlight().attemptsTo(FillAllFieldsValidations.validations());
        System.out.println("Hello world");
    }

}
