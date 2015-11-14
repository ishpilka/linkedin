package com.linkedin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerificationTextTest {
    protected WebDriver driver;

    //public VerificationTextTest(WebDriver driver){
        //this.driver = driver;
    //}
    private RegistrationPage registrationPage;
    @Test
    public void securityVerification(){
        registrationPage = PageFactory.initElements(new FirefoxDriver(), RegistrationPage.class);
        registrationPage.open();
        String Email = "iuliia.shpilka@gmail.com";
        registrationPage.submitRegistrationForm("First", "Last", Email, "P@ssword123");
        String text = driver.findElement(By.xpath("//div[contains(@class, 'alerts-cont') and //text()='Someone’s already using that email.")).getText();
        if (text=="Someone’s already using that email."){
            System.out.println("error message - Someone’s already using that email.");
        }
        else {
            System.out.println("error message isnt Someone’s already using that email.");
        }
        //assert securityVerification form displayed;
        //WebElement errorMessage = driver.findElement(By.xpath("//div[contains(@class, 'alerts-cont')  and //text()='Someone’s already using that email.'"));
        //Assert.assertTrue(errorMessage.isDisplayed(),"Someone’s already using that email.");
        registrationPage.close();
    }
}
