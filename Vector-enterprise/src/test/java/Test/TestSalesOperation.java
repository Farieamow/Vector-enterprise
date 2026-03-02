package Test;

import Pages.Dashboard;
import Pages.salesoperation;
import Utilities.webdriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import static java.awt.SystemColor.window;

public class TestSalesOperation extends webdriverSetup {

    salesoperation sale = new salesoperation();
    LoginTest logintest = new LoginTest();

    @Test
    public void testsales() throws InterruptedException {
        logintest.LoginTest();
        Thread.sleep(2000);
        getBrowser().get(sale.url);
        Thread.sleep(2000);

        WebDriverWait wait = new WebDriverWait(getBrowser(), Duration.ofSeconds(10));
        for (int i = 0; i < 2; i++) {
            wait.until(ExpectedConditions.elementToBeClickable(sale.area_hidden));
            getBrowser().findElement(sale.area_hidden).click();
            Thread.sleep(2000);
        }
        Actions action = new Actions(getBrowser());
        List<WebElement> clearBtn = getBrowser().findElements(sale.cleardate);

        if(!clearBtn.isEmpty()) {
            JavascriptExecutor js = (JavascriptExecutor) getBrowser();
            js.executeScript("arguments[0].click();", clearBtn.get(0));
            Thread.sleep(3000);
            //action.scrollToElement(getBrowser().findElement(sale.scroll)).build().perform();
           // action.scrollByAmount(0, 500).perform();
            //JavascriptExecutor js1 = (JavascriptExecutor) getBrowser();
            //js.executeScript("window.scrollBy(0,500)");
        }

        sale.clickOnElement(By.id("rc_select_0"));
        //sale.clickOnElement(By.xpath("(//input[@id='rc_select_7'])[1]"));
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
        Thread.sleep(2000);
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
        Thread.sleep(2000);
        action.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2000);

        sale.clickOnElement(sale.Deposit_status);
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
        Thread.sleep(2000);
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
        Thread.sleep(2000);
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
        Thread.sleep(2000);
        action.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2000);

        List<WebElement> cleardate = getBrowser().findElements(sale.cleardate);

        if(!cleardate.isEmpty()) {
            JavascriptExecutor js = (JavascriptExecutor) getBrowser();
            js.executeScript("arguments[0].click();", cleardate.get(0));
            Thread.sleep(3000);

        sale.clickOnElement(sale.Datetype);
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
        Thread.sleep(200);
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
        Thread.sleep(200);
        action.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2000);
    }
}}