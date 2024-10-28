package com.netflix;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    @Test
    public void testNoInputData() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.netflix.com/login");
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.toClickButtonEnter();
        Assert.assertEquals(LoginMessage.TEXT_ERROR_NO_EMAIL, loginPage.toGetMessageError(LoginXpath.TEXT_ERROR_NO_EMAIL_XPATH));
        Assert.assertEquals(LoginMessage.TEXT_ERROR_NO_PASSWORD, loginPage.toGetMessageError(LoginXpath.TEXT_ERROR_NO_PASSWORD_XPATH));
    }

    @Test
    public void testNoInputEmail() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webDriver.get("https://www.netflix.com/login");
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.toEnterPassword("qwerty");
        loginPage.toClickButtonEnter();
        Assert.assertEquals(LoginMessage.TEXT_ERROR_NO_EMAIL, loginPage.toGetMessageError(LoginXpath.TEXT_ERROR_NO_EMAIL_XPATH));
    }

    @Test
    public void testNoInputPassword() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webDriver.get("https://www.netflix.com/login");
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.toClickButtonEnter();
        loginPage.toEnterEmail(LoginPage.email);
        Assert.assertEquals(LoginMessage.TEXT_ERROR_NO_PASSWORD, loginPage.toGetMessageError(LoginXpath.TEXT_ERROR_NO_PASSWORD_XPATH));
    }

    @Test
    public void testInputEmailPassword() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webDriver.get("https://www.netflix.com/login");
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.toEnterEmail(LoginPage.email);
        loginPage.toEnterPassword("qwerty");
        loginPage.toClickButtonEnter();
        Assert.assertEquals(LoginMessage.TEXT_ERROR_INPUT_PASSWORD_EMAIL, loginPage.toGetMessageError(LoginXpath.TEXT_ERROR_INPUT_PASSWORD_EMAIL_XPATH));
    }
}
