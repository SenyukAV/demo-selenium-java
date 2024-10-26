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
        String signInXpath="//*[@id=\"main-content\"]/div/nav/ul/li[1]/a";
        By bySignInXpath= By.xpath(signInXpath);
        WebElement clickSignIn= webDriver.findElement(bySignInXpath);
        clickSignIn.click();

    }

    @Test
    public void test2() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://secure.login.gov/");
        String signInXpath="//*[@id=\"main-content\"]/div/nav/ul/li[1]/a";
        String textEmailXpath="//*[@id=\"user_email\"]";
        By bySignInXpath= By.xpath(signInXpath);
        By byTextEmailXpath= By.xpath(textEmailXpath);
        WebElement inputTextEmail=webDriver.findElement(byTextEmailXpath);
        String textEmail="testA@test.com";
        inputTextEmail.sendKeys(textEmail);

        WebElement clickSignIn= webDriver.findElement(bySignInXpath);
        clickSignIn.click();

    }
}
