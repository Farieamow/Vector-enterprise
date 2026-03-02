package Pages;

import Utilities.webdriverSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

@Test
public class logout extends webdriverSetup {

    Dashboard dashboard = new Dashboard();
    login login = new login();

    public  void testlogout() throws InterruptedException {
        getBrowser().get("https://test.accounts.vector360bd.com/");
        Thread.sleep(3000);

        login.writeOnElement(login.phonenumber_box, "admin@gmail.com");
        login.writeOnElement(login.password_box, "123456");
        login.clickOnElement(login.loginBtn);
        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(getBrowser(), Duration.ofSeconds(10));
        Actions action = new Actions(getBrowser());
        WebElement logout = wait.until(
                ExpectedConditions.elementToBeClickable(dashboard.logout)
        );

        action.moveToElement(logout).perform();
        getBrowser().findElement(dashboard.logout).click();
        Thread.sleep(3000);

        WebElement no = wait.until(
                ExpectedConditions.elementToBeClickable(dashboard.nobtn)
        );

        action.moveToElement(no).perform();
        getBrowser().findElement(dashboard.nobtn).click();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.urlContains("dashboard"));

        }

    public void testLogoutConfirm() throws InterruptedException {

        getBrowser().get("https://test.accounts.vector360bd.com/");
        Thread.sleep(3000);

        login.writeOnElement(login.phonenumber_box, "admin@gmail.com");
        login.writeOnElement(login.password_box, "123456");
        login.clickOnElement(login.loginBtn);
        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(getBrowser(), Duration.ofSeconds(10));
        Actions action = new Actions(getBrowser());
        WebElement logout = wait.until(
                ExpectedConditions.elementToBeClickable(dashboard.logout)
        );

        action.moveToElement(logout).perform();
        getBrowser().findElement(dashboard.logout).click();
        Thread.sleep(3000);

        WebElement yes = wait.until(
                ExpectedConditions.elementToBeClickable(dashboard.yesbtn)
        );

        action.moveToElement(yes).perform();
        getBrowser().findElement(dashboard.yesbtn).click();
        Thread.sleep(3000);


    }

    }
