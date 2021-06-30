package com.demoqa.automation.tasks;

import com.demoqa.automation.models.DataInjection;
import com.demoqa.automation.ui.TextBoxPage;
import com.demoqa.automation.utils.SpecialMethods;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillAllFields implements Task {

    DataInjection dataInjection = new DataInjection();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(dataInjection.getFullName()).into(TextBoxPage.FULL_NAME_INPUT),
                Enter.theValue(dataInjection.getEmail()).into(TextBoxPage.EMAIL_INPUT),
                Enter.theValue(dataInjection.getCurrentAddress()).into(TextBoxPage.CURRENT_ADDRESS_INPUT),
                Enter.theValue(dataInjection.getPermanentAddress()).into(TextBoxPage.PERMANENT_ADDRESS_INPUT),
                JavaScriptClick.on(TextBoxPage.SUBMIT_BUTTON)
        );
    }

    public static FillAllFields successful (){
        return instrumented(FillAllFields.class);
    }


}
