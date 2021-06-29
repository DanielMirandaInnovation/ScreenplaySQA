package com.demoqa.automation.tasks;

import com.demoqa.automation.models.DataInjection;
import com.demoqa.automation.ui.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectTextBoxOption implements Task {

    DataInjection dataInjection = new DataInjection();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(HomePage.ELEMENTS_OPTION, isVisible()),
                Click.on(HomePage.ELEMENTS_OPTION),
                WaitUntil.the(HomePage.TEXT_BOX_OPTION, isVisible()),
                Click.on(HomePage.TEXT_BOX_OPTION));
    }

    public static SelectTextBoxOption goTo (){
        return instrumented(SelectTextBoxOption.class);
    }

}
