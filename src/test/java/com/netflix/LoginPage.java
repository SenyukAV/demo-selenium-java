package com.netflix;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver webDriver;
    public static String email = "qwerty123@gmail.com";

    LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void toClickButtonEnter() {
        By byClickButtonEnter = By.xpath(LoginXpath.ENTER_BUTTON_XPATH);
        WebElement webElementClickButtonEnter = webDriver.findElement(byClickButtonEnter);
        webElementClickButtonEnter.click();
    }

    public void toEnterEmail(String email) {
        By byEnterEmail = By.xpath(LoginXpath.INPUT_EMAIL_XPATH);
        WebElement webElementEnterEmail = webDriver.findElement(byEnterEmail);
        webElementEnterEmail.sendKeys(email);
    }

    public void toEnterPassword(String password) {
        By byEnterPassword = By.xpath(LoginXpath.INPUT_PASSWORD_XPATH);
        WebElement webElementEnterPassword = webDriver.findElement(byEnterPassword);
        webElementEnterPassword.sendKeys(password);
    }

    public String toGetMessageError(String xPath) {
        By byMessageError = By.xpath(xPath);
        WebElement webElementMessageError = webDriver.findElement(byMessageError);
        return webElementMessageError.getText();
    }
}
