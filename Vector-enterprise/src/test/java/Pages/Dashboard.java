package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Dashboard extends BasePage{
    public String URL= "https://test.accounts.vector360bd.com/app/dashboard";
    public By area_hidden=By.xpath("(//*[name()='svg'][contains(@class,'iconify iconify--ant-design')])[1]");
    //public By area=By.xpath("(//*[name()='svg'][@class='iconify iconify--ant-design '])[1]");
    public By Dropdownbox=By.xpath("(//span[@class='ant-select-selection-search'])[1]");
    public By dropdown1= By.xpath("(//span[@class='ant-select-arrow'])[1]");
    public By dropdown2= By.xpath("(//span[@title='Retail'])[1]");

    public By datefilter= By.xpath("(//div[@class='ant-picker ant-picker-range ant-picker-large ant-picker-outlined css-xjvm6d w-full'])[1]");
    public By fromdate= By.xpath("(//input[@placeholder='From Date'])[1]");
    public By todate= By.xpath("(//input[@placeholder='To Date'])[1]");

    public By totalChallan=By.xpath("(//a)[2]");
    public By totalSales=By.xpath("(//main[contains(@class,'ant-layout-content p-2 lg:p-4 css-xjvm6d')])[1]");
    public By totalReceived=By.xpath("(//main[contains(@class,'ant-layout-content p-2 lg:p-4 css-xjvm6d')])[1]");
    public By totalDue=By.xpath("(//main[@class='ant-layout-content p-2 lg:p-4 css-xjvm6d'])[1]");


    //Menubar
    public By Dashboardmenu=By.xpath("(//span[normalize-space()='Dashboard'])[1]");
    public By Sales_operation=By.xpath("(//li[@role='menuitem'])[2]");
    public By Store_analytics=By.xpath("(//span[normalize-space()='Store Analytics'])[1]");
    public By sms_service=By.xpath("(//span[normalize-space()='SMS Service'])[1]");
    public By section_route=By.xpath("(//span[normalize-space()='Section & Route'])[1]");
    public By employee_management=By.xpath("(//span[normalize-space()='Employee Management'])[1]");
    public By cash_report=By.xpath("(//span[normalize-space()='Cash Report'])[1]");
    public By jso_report=By.xpath("(//span[normalize-space()='JSO'])[1]");
    public By so_report=By.xpath("(//span[normalize-space()='SO'])[1]");
    public By fse_report=By.xpath("(//span[normalize-space()='FSE'])[1]");
    public By monthly_report=By.xpath("(//span[normalize-space()='Monthly'])[1]");

    public By logout=By.xpath("(//p[@class='block text-nowrap ml-2'])[1]");
    public By nobtn=By.xpath("(//span[normalize-space()='No'])[1]");
    public By yesbtn=By.xpath("(//span[normalize-space()='Yes'])[1]");


    }







