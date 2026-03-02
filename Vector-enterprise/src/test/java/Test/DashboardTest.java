package Test;
import Pages.Dashboard;
import Utilities.webdriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;

public class DashboardTest extends webdriverSetup {

    Dashboard dashboard = new Dashboard();
    LoginTest logintest=new LoginTest();


    @Test
    public void testdashboard() throws InterruptedException {
        logintest.LoginTest();
        Thread.sleep(2000);

        WebDriverWait wait = new WebDriverWait(getBrowser(), Duration.ofSeconds(10));
        for (int i = 0; i < 2; i++) {
            wait.until(ExpectedConditions.elementToBeClickable(dashboard.area_hidden));
            getBrowser().findElement(dashboard.area_hidden).click();
            Thread.sleep(2000);
        }
        Actions action = new Actions(getBrowser());
        dashboard.clickOnElement(By.id("rc_select_0"));
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
        Thread.sleep(2000);
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
        Thread.sleep(2000);
        action.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2000);
        action.sendKeys(Keys.ESCAPE).perform();
        Thread.sleep(2000);
        WebElement salesOperation = wait.until(
                ExpectedConditions.elementToBeClickable(dashboard.Sales_operation)
        );

        action.moveToElement(salesOperation).perform();
        getBrowser().findElement(dashboard.Sales_operation).click();

        Thread.sleep(3000);
        WebElement dashboard1 = wait.until(ExpectedConditions.elementToBeClickable(dashboard.Dashboardmenu));

        action.moveToElement(salesOperation).perform();
        getBrowser().findElement(dashboard.Dashboardmenu).click();
        Thread.sleep(3000);

        WebElement storeAnalytics = wait.until(ExpectedConditions.elementToBeClickable(dashboard.Store_analytics));

        action.moveToElement(storeAnalytics).perform();
        getBrowser().findElement(dashboard.Store_analytics).click();
        Thread.sleep(3000);

        wait.until(ExpectedConditions.elementToBeClickable(dashboard.Dashboardmenu));
        action.moveToElement(salesOperation).perform();
        getBrowser().findElement(dashboard.Dashboardmenu).click();
        Thread.sleep(3000);

        WebElement smsService = wait.until(ExpectedConditions.elementToBeClickable(dashboard.sms_service));

        action.moveToElement(smsService).perform();
        getBrowser().findElement(dashboard.sms_service).click();
        Thread.sleep(3000);

        wait.until(ExpectedConditions.elementToBeClickable(dashboard.Dashboardmenu));
        action.moveToElement(salesOperation).perform();
        getBrowser().findElement(dashboard.Dashboardmenu).click();
        Thread.sleep(3000);

        WebElement SectionRoute = wait.until(
                ExpectedConditions.elementToBeClickable(dashboard.section_route)
        );

        action.moveToElement(SectionRoute).perform();
        getBrowser().findElement(dashboard.section_route).click();
        Thread.sleep(3000);

        wait.until(ExpectedConditions.elementToBeClickable(dashboard.Dashboardmenu));
        action.moveToElement(salesOperation).perform();
        getBrowser().findElement(dashboard.Dashboardmenu).click();
        Thread.sleep(3000);

        WebElement employeeManagement = wait.until(
                ExpectedConditions.elementToBeClickable(dashboard.employee_management)
        );

        action.moveToElement(employeeManagement).perform();
        getBrowser().findElement(dashboard.employee_management).click();
        Thread.sleep(3000);

        wait.until(ExpectedConditions.elementToBeClickable(dashboard.Dashboardmenu));
        action.moveToElement(salesOperation).perform();
        getBrowser().findElement(dashboard.Dashboardmenu).click();
        Thread.sleep(3000);

        WebElement cashReport = wait.until(
                ExpectedConditions.elementToBeClickable(dashboard.cash_report)
        );

        action.moveToElement(cashReport).perform();
        getBrowser().findElement(dashboard.cash_report).click();
        Thread.sleep(3000);

        WebElement jso = wait.until(
                ExpectedConditions.elementToBeClickable(dashboard.jso_report)
        );

        action.moveToElement(jso).perform();
        getBrowser().findElement(dashboard.jso_report).click();
        Thread.sleep(3000);

        wait.until(ExpectedConditions.elementToBeClickable(dashboard.Dashboardmenu));
        action.moveToElement(salesOperation).perform();
        getBrowser().findElement(dashboard.Dashboardmenu).click();
        Thread.sleep(3000);

        WebElement so = wait.until(ExpectedConditions.elementToBeClickable(dashboard.so_report));

        action.moveToElement(so).perform();
        getBrowser().findElement(dashboard.so_report).click();
        Thread.sleep(3000);

        wait.until(ExpectedConditions.elementToBeClickable(dashboard.Dashboardmenu));
        action.moveToElement(salesOperation).perform();
        getBrowser().findElement(dashboard.Dashboardmenu).click();
        Thread.sleep(3000);

        WebElement fse = wait.until(ExpectedConditions.elementToBeClickable(dashboard.fse_report));

        action.moveToElement(fse).perform();
        getBrowser().findElement(dashboard.fse_report).click();
        Thread.sleep(3000);

        wait.until(ExpectedConditions.elementToBeClickable(dashboard.Dashboardmenu));
        action.moveToElement(salesOperation).perform();
        getBrowser().findElement(dashboard.Dashboardmenu).click();
        Thread.sleep(3000);

        WebElement monthly = wait.until(ExpectedConditions.elementToBeClickable(dashboard.monthly_report));

        action.moveToElement(monthly).perform();
        getBrowser().findElement(dashboard.monthly_report).click();
        Thread.sleep(3000);

        wait.until(ExpectedConditions.elementToBeClickable(dashboard.Dashboardmenu));
        action.moveToElement(salesOperation).perform();
        getBrowser().findElement(dashboard.Dashboardmenu).click();
        Thread.sleep(3000);




    }   }




