package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class salesoperation extends BasePage{
    public String url="https://test.accounts.vector360bd.com/app/challan";
    public By area_hidden=By.xpath("(//*[name()='svg'][contains(@class,'iconify iconify--ant-design')])[1]");
    public By selectSalesType=By.id("rc_select_0");
    public By select=By.xpath("((//span[@class='ant-select-arrow'])[1]");
    public By wholesale=By.xpath("(//span[contains(@title,'Wholesale')])[1]");
    public By Deposit_status=By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[3]/div[2]/div[1]/span[1]/span[1]");
    public By Datetype=By.id("rc_select_2");
    public By datefilter= By.xpath("(//div[@class='ant-picker ant-picker-range ant-picker-large ant-picker-outlined css-xjvm6d w-full'])[1]");
    public By fromdate= By.xpath("(//input[@placeholder='From Date'])[1]");
    public By AddChallan=By.xpath("(//span[normalize-space()='Add Challan'])[1]");
    //public By SelectSo=By.xpath("(//input[@id='rc_select_7'])[1]");
    public By fileupload=By.xpath("(//input[@id='rc_select_7'])[1]");
    //public By selectSo=By.xpath("(//div[contains(@class,'ant-select-selector')])[5])");
    public By cleardate=By.className("ant-picker-clear");
    //public By getCleardate=By.xpath("//span[@class='ant-select-clear']//span[@aria-label='close-circle']//*[name()='svg']");
    public By dropdownLocator = By.xpath("(//span[@title='Delivery Date'])[1]");
    public By scroll=By.xpath("//tbody");
    public By date=By.xpath("//div[@class='ant-picker-panels']//div[1]//div[1]//div[1]//div[1]");
    public By date2=By.xpath("//div[@class='ant-picker-panels']//div[1]//div[1]//div[2]");
    public By todate=By.xpath("(//div[contains(@class,'ant-picker-panel')])[2]//td[@title='2026-03-10']//div");
    public By search=By.xpath("//input[@placeholder='Search with ChallanNo,SO,JSO,FSE or Section name...']");
    public By addchallanbtn=By.xpath("//button[contains(@class,'ant-btn')]");
    public By selectso=By.xpath("//div[@name='so']//span[@class='ant-select-selection-search']");
    public By filebox=By.xpath("//span[@class='anticon anticon-upload']//*[name()='svg']");



    public void clickIfExists(By cleardate) throws InterruptedException {
        List<WebElement> elements = getBrowser().findElements(cleardate);

        if (!elements.isEmpty()) {
            JavascriptExecutor js = (JavascriptExecutor) getBrowser();
            js.executeScript("arguments[0].click();", elements.get(0));
            Thread.sleep(3000);
        }
    }
    public void uploadExcelFile( String filePath){
        WebDriverWait wait = new WebDriverWait(getBrowser(), Duration.ofSeconds(10));
        WebElement fileInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='file']")));
        fileInput.sendKeys(filePath);
    }



    }




