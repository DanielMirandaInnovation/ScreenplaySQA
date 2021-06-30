package com.demoqa.automation.tasks;

import com.demoqa.automation.models.DataInjection;
import com.demoqa.automation.ui.LoginPage;
import com.demoqa.automation.utils.Excel;
import com.demoqa.automation.utils.SpecialMethods;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginWithDataExcel implements Task {

    DataInjection dataInjection = new DataInjection();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                JavaScriptClick.on(LoginPage.NEW_USER_BUTTON),
                Enter.theValue(Excel.getCellValue(dataInjection.getFilepath(),dataInjection.getLoginCredentialsNameSheet(),1,0)).into(LoginPage.FIRST_NAME_INPUT),
                Enter.theValue(Excel.getCellValue(dataInjection.getFilepath(),dataInjection.getLoginCredentialsNameSheet(),1,1)).into(LoginPage.LAST_NAME_INPUT),
                Enter.theValue(Excel.getCellValue(dataInjection.getFilepath(),dataInjection.getLoginCredentialsNameSheet(),1,2)).into(LoginPage.USER_NAME_INPUT),
                Enter.theValue(Excel.getCellValue(dataInjection.getFilepath(),dataInjection.getLoginCredentialsNameSheet(),1,3)).into(LoginPage.PASSWORD_INPUT),
                Scroll.to(LoginPage.REGISTER_BUTTON)
        );
    }

    public static LoginWithDataExcel dataExcel (){
        return instrumented(LoginWithDataExcel.class);
    }
}
