package com.linkedin;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class RegistrationTest {
    private RegistrationPage registrationPage;
    @Test
    public void securityVerification(){
        registrationPage = PageFactory.initElements(new FirefoxDriver(), RegistrationPage.class);
        registrationPage.open();
        String uniqueEmail = "lnkdn_"+System.currentTimeMillis()+"@mailinator.com";
        registrationPage.submitRegistrationForm("First", "Last", uniqueEmail, "P@ssword123");
        //assert securityVerification form displayed
        registrationPage.close();
    }
}
