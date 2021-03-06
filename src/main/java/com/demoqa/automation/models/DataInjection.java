package com.demoqa.automation.models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataInjection {

    Faker faker = new Faker(new Locale("en-US"));

    private String fullName, email, currentAddress, permanentAddress, extensionName,
            filepath, loginCredentialsNameSheet, validationSheet;



    public DataInjection(){

        this.fullName = "DanielMiranda27";
        this.email = faker.internet().emailAddress();
        this.currentAddress = faker.address().streetAddress();
        this.permanentAddress = faker.address().fullAddress();
        this.extensionName = "Name:";
        this.filepath = "resources/dataExcel.xlsx";
        this.loginCredentialsNameSheet = "loginCredentials";
        this.validationSheet = "validations";
    }

    public String getValidationSheet() {
        return validationSheet;
    }

    public String getFilepath() {
        return filepath;
    }

    public String getLoginCredentialsNameSheet() {
        return loginCredentialsNameSheet;
    }

    public String getExtensionName() {
        return extensionName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }
}
