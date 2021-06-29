package com.demoqa.automation.tasks;

import com.demoqa.automation.models.DataInjection;
import com.demoqa.automation.questions.PresenceElements;
import com.demoqa.automation.questions.Validations;
import com.demoqa.automation.ui.TextBoxPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillAllFieldsValidations implements Task {

    DataInjection dataInjection = new DataInjection();
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.should(seeThat(PresenceElements.visible(TextBoxPage.EMAIL_VALIDATION)),
                seeThat(Validations.in(TextBoxPage.NAME_VALIDATION),equalToIgnoringCase(dataInjection.getExtensionName()+dataInjection.getFullName())));

    }

    public static FillAllFieldsValidations validations (){
        return instrumented(FillAllFieldsValidations.class);
    }
}
