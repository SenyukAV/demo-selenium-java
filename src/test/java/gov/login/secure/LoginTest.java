package gov.login.secure;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    @Test
    public void test1() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://secure.login.gov/");
        String signInXpath = "//*[@id=\"new_user\"]/lg-captcha-submit-button/lg-spinner-button/button";
        By bySignInXpath = By.xpath(signInXpath);
        WebElement clickSignIn = webDriver.findElement(bySignInXpath);
        clickSignIn.click();
    }

    @Test
    public void test2() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://secure.login.gov/");
        String signInXpath = "//*[@id=\"new_user\"]/lg-captcha-submit-button/lg-spinner-button/button";
        String textEmailXpath = "//*[@id=\"user_email\"]";
        By bySignInXpath = By.xpath(signInXpath);
        By byTextEmailXpath = By.xpath(textEmailXpath);
        WebElement inputTextEmail = webDriver.findElement(byTextEmailXpath);
        String textEmail = "testA@test.com";
        inputTextEmail.sendKeys(textEmail);
        WebElement clickSignIn = webDriver.findElement(bySignInXpath);
        clickSignIn.click();
    }

    @Test
    public void test3() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://secure.login.gov/");
        String passwordXpath = "/html/body/main/div/form/lg-password-toggle/lg-validated-field/div/input";
        By passwordBy = By.xpath(passwordXpath);
        WebElement passwordWebElement = webDriver.findElement(passwordBy);
        String passwordText = "1q2w#E4r";
        passwordWebElement.sendKeys(passwordText);
        String signInXpath = "//*[@id=\"new_user\"]/lg-captcha-submit-button/lg-spinner-button/button";
        By bySignInXpath = By.xpath(signInXpath);
        WebElement clickSignIn = webDriver.findElement(bySignInXpath);
        clickSignIn.click();
    }

    @Test
    public void test4() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://secure.login.gov/");
        String passwordXpath = "/html/body/main/div/form/lg-password-toggle/lg-validated-field/div/input";
        String textEmailXpath = "//*[@id=\"user_email\"]";
        String signInXpath = "//*[@id=\"new_user\"]/lg-captcha-submit-button/lg-spinner-button/button";
        By passwordBy = By.xpath(passwordXpath);
        By byTextEmailXpath = By.xpath(textEmailXpath);
        WebElement passwordWebElement = webDriver.findElement(passwordBy);
        WebElement inputTextEmail = webDriver.findElement(byTextEmailXpath);
        String textEmail = "testA@test.com";
        String passwordText = "a1S@d3F$";
        passwordWebElement.sendKeys(passwordText);
        inputTextEmail.sendKeys(textEmail);
        By bySignInXpath = By.xpath(signInXpath);
        WebElement clickSignIn = webDriver.findElement(bySignInXpath);
        clickSignIn.click();
    }
}
