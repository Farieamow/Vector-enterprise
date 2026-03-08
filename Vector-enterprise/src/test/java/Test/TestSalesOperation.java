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
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.time.Duration;
import java.util.List;

//import static java.awt.SystemColor.window;
@Test
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
        /*for (int i = 0; i < 2; i++) {
            wait.until(ExpectedConditions.elementToBeClickable(sale.area_hidden));
            getBrowser().findElement(sale.area_hidden).click();
            Thread.sleep(2000);
        }*/
      // Actions action = new Actions(getBrowser());

       sale.clickIfExists(sale.cleardate);

        /*sale.clickOnElement(sale.selectSalesType);
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

        WebDriverWait wait2 = new WebDriverWait(getBrowser(), Duration.ofSeconds(10));
        WebElement dropdown = wait2.until(
                ExpectedConditions.visibilityOfElementLocated(sale.dropdownLocator));

       action.moveToElement(dropdown).click().perform();
       Thread.sleep(2000);*/


       /*WebDriverWait wait3 = new WebDriverWait(getBrowser(), Duration.ofSeconds(10));
       WebElement fdate = wait3.until(
               ExpectedConditions.visibilityOfElementLocated(sale.fromdate));
       action.doubleClick(fdate).perform();
       Thread.sleep(2000);
       WebElement date = wait.until(ExpectedConditions.elementToBeClickable(sale.date));
       action.moveToElement(date).click().perform();
       Thread.sleep(2000);
       getBrowser().findElement(By.className("ant-picker-content")).click();
       Thread.sleep(2000);
       WebElement date2 = wait.until(ExpectedConditions.elementToBeClickable(sale.date2));
       action.moveToElement(date2).click().perform();
       WebElement toDate = getBrowser().findElement(sale.todate);

       ((JavascriptExecutor)
               getBrowser()).executeScript("arguments[0].click();", toDate);
       Thread.sleep(2000);
       sale.clickIfExists(sale.cleardate);

       WebDriverWait wait5 = new WebDriverWait(getBrowser(), Duration.ofSeconds(10));

       WebElement searchBox = wait.until(
               ExpectedConditions.visibilityOfElementLocated(sale.search));
       searchBox.clear();
       searchBox.sendKeys("53");*/
       Thread.sleep(200);

       /*getBrowser().findElement(sale.addchallanbtn).click();
       Thread.sleep(2000);
       WebElement selectso = wait.until(
               ExpectedConditions.visibilityOfElementLocated(sale.selectso));
       action.moveToElement(selectso).click().perform();
       Thread.sleep(2000);
       //sale.clickOnElement(sale.selectso);
       action.sendKeys(Keys.ARROW_DOWN).build().perform();
       Thread.sleep(200);
       action.sendKeys(Keys.ARROW_DOWN).build().perform();
       Thread.sleep(200);
       action.sendKeys(Keys.ENTER).build().perform();
       Thread.sleep(200);
       action.sendKeys(Keys.ARROW_DOWN).build().perform();
       // action.sendKeys(Keys.ENTER).build().perform();
       Thread.sleep(200);
       action.sendKeys(Keys.ARROW_DOWN).build().perform();
       action.sendKeys(Keys.ENTER).build().perform();
       Thread.sleep(2000);
       WebDriverWait wait6 = new WebDriverWait(getBrowser(), Duration.ofSeconds(10));

       /*WebElement jsoField = wait6.until(
               ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='jso']"))
       );

       String jsoValue = jsoField.getAttribute("value");
       System.out.println("JSO Value = " + jsoValue);*/
       //WebElement jsoField = getBrowser().findElement(By.xpath("//input[@name='jso']"));
      //WebElement upload = wait.until(
              //ExpectedConditions.visibilityOfElementLocated(sale.filebox));
      //.moveToElement(upload).click().perform();
      //getBrowser().findElement(By.xpath("//button[@type='submit']")).click();

       /*String jsoValue = jsoField.getAttribute("value");
       if (jsoValue == null || jsoValue.isEmpty()) {
           System.out.println("Upload not allowed because JSO is not assigned");
           Assert.fail("JSO not assigned");
       } else {

           sale.uploadExcelFile("D:\\Sales Print\\Ahahad.xls");

       }*/
     /* WebElement upload2= getBrowser().findElement(By.xpath("//input[@type='file']"));
      upload.sendKeys("C:\\Users\\User\\Downloads\\Hair Wash.jpg")
      WebElement uploadBtn = getBrowser().findElement(By.className("ant-upload"));

      uploadBtn.click();

      WebElement fileInput = getBrowser().findElement(By.xpath("//input[@type='file']"));

      fileInput.sendKeys("D:\\Sales Print\\Ahahad.xlsx");
      Thread.sleep(2000);
       //action.moveToElement(sale.getElement(sale.filebox)).click().build().perform();*/



      getBrowser().findElement(sale.addchallanbtn).click();
      Thread.sleep(2000);

      // ---------- 1. Select SO (Write your SO selection code here) ----------
      WebElement so = wait.until(
              ExpectedConditions.elementToBeClickable(sale.selectso)
      );
      so.click();
      Actions action = new Actions(getBrowser());
      action.sendKeys(Keys.ARROW_DOWN).build().perform();
      Thread.sleep(200);
      action.sendKeys(Keys.ARROW_DOWN).build().perform();
      Thread.sleep(200);
      action.sendKeys(Keys.ENTER).build().perform();
      Thread.sleep(200);
      action.sendKeys(Keys.ARROW_DOWN).build().perform();
      action.sendKeys(Keys.ARROW_DOWN).build().perform();
      action.sendKeys(Keys.ENTER).build().perform();
      Thread.sleep(2000);

      // Thread.sleep(1000);

      // ---------- 2. Verify JSO ----------
      WebElement jsoField = getBrowser().findElement(By.xpath("//input[@name='jso']"));
      String jsoValue = jsoField.getAttribute("value");

      if(jsoValue == null || jsoValue.isEmpty()){
         Assert.fail("JSO not assigned. Upload not allowed.");
      }
       //getBrowser().findElement(sale.filebox).click();
      Thread.sleep(2000);
      // ---------- 3. Upload Excel File ----------
      WebElement fileInput = wait.until(
              ExpectedConditions.presenceOfElementLocated(
                      By.xpath("//input[@type='file']")));
      //getBrowser().findElement(By.xpath("//input[@type='file']"));
       File file = new File("C:\\Users\\User\\Ahad.xls");

       if(file.exists()){
           fileInput.sendKeys(file.getAbsolutePath());
       }else{
           System.out.println("File not found!");
       }
                     // fileInput.sendKeys("D://Sales Print//Ahahad.xls");


      Thread.sleep(2000);

      // ---------- 4. Click Add Button ----------
      WebElement addBtn = wait.until(
              ExpectedConditions.elementToBeClickable(
                      By.xpath("//button[@type='submit']")
              )
      );

      addBtn.click();

      // ---------- 5. Verify Success Message ----------
     /* WebElement successMsg = wait.until(
              ExpectedConditions.visibilityOfElementLocated(
                      By.xpath("//*[contains(text(),'success')]")
              )
      );*/

     // Assert.assertTrue(successMsg.isDisplayed());

   }

}
