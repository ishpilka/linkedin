package com.linkedin;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
    @Test

    public static  void errorOnLoginWithInvalidCredentials() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.linkedin.com/");
        driver.findElement(By.id("login-email")).sendKeys("Phoenixland@ukr.net");
        driver.findElement(By.id("login-password")).sendKeys("wrongpass");
        driver.findElement(By.name("submit")).click();
        Thread.sleep(5000);
        WebElement errorMessage = driver.findElement(By.xpath("//*[text()='There were one or more errors in your submission. Please correct the marked fields below.']"));
        Assert.assertTrue(errorMessage.isDisplayed(),"Element is not displayed");
        //driver.findElement(By.linkText("There were one or more errors in your submission. Please correct the marked fields below."));






        }



    }



