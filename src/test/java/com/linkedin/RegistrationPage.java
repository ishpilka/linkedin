package com.linkedin;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage {
    protected WebDriver driver;

    public RegistrationPage(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(id = "first-name")
    private WebElement firstNameInput;

    @FindBy(id = "last-name")
    private WebElement lastNameInput;

    @FindBy(id = "join-email")
    private WebElement emailInput;

    @FindBy(id = "join-password")
    private WebElement passwordInpute;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement joinButton;
    public void submitRegistrationForm(String firstName, String lastName, String email,String password){
        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        emailInput.sendKeys(email);
        passwordInpute.sendKeys(password);
        joinButton.click();
    }

    public void open() {
        driver.get("https://www.linkedin.com/");
    }

    public void close() { driver.quit(); }
}
