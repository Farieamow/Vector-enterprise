package Pages;

import org.openqa.selenium.By;

public class salesoperation extends BasePage{
    public String url="https://test.accounts.vector360bd.com/app/challan";
    public By area_hidden=By.xpath("(//*[name()='svg'][contains(@class,'iconify iconify--ant-design')])[1]");
    public By selectSalesType=By.id("rc_select_7");
    public By select=By.xpath("((//span[@class='ant-select-arrow'])[1]");
    public By wholesale=By.xpath("(//span[contains(@title,'Wholesale')])[1]");
    public By Deposit_status=By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[3]/div[2]/div[1]/span[1]/span[1]");
    public By Datetype=By.id("rc_select_2");
    public By datefilter= By.xpath("(//div[@class='ant-picker ant-picker-range ant-picker-large ant-picker-outlined css-xjvm6d w-full'])[1]");
    public By fromdate= By.xpath("(//input[@placeholder='From Date'])[1]");
    public By todate= By.xpath("(//input[@placeholder='To Date'])[1]");
    public By AddChallan=By.xpath("(//span[normalize-space()='Add Challan'])[1]");
    public By SelectSo=By.xpath("(//input[@id='rc_select_7'])[1]");
    public By fileupload=By.xpath("(//input[@id='rc_select_7'])[1]");
    public By selectSo=By.xpath("(//div[contains(@class,'ant-select-selector')])[5])");
    public By cleardate=By.className("ant-picker-clear");
    public By getCleardate=By.className("ant-select-clear");
    public By scroll=By.xpath("//tbody");



}
