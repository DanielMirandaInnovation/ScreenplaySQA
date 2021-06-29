package com.demoqa.automation.ui;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static String urlHome = "https://www.demoqa.com/";
    public static final Target ELEMENTS_OPTION = Target.the("").locatedBy("//h5[text()='Elements']");
    public static final Target ELEMENTS_OPTION_MENU = Target.the("").locatedBy("//div[@class='element-group']//div[text()='Elements']");
    public static final Target TEXT_BOX_OPTION = Target.the("").locatedBy("//span[text()='Text Box']");

}
