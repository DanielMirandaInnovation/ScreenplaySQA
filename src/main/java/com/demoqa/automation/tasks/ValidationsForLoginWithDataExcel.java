package com.demoqa.automation.tasks;

import com.demoqa.automation.models.DataInjection;
import com.demoqa.automation.questions.Validations;
import com.demoqa.automation.ui.LoginPage;
import com.demoqa.automation.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ValidationsForLoginWithDataExcel implements Task {

    DataInjection dataInjection = new DataInjection();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.should(seeThat(Validations.in(LoginPage.BACK_TO_LOGIN_BUTTON),equalToIgnoringCase(Excel.getCellValue(dataInjection.getFilepath(),dataInjection.getValidationSheet(),0,0))));
    }
    public static ValidationsForLoginWithDataExcel validations (){
        return instrumented(ValidationsForLoginWithDataExcel.class);
    }
}
