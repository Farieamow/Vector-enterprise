package Test;
import Pages.Dashboard;
import Pages.login;
//import Utilities.DataSet;
import Utilities.DataSet;
import Utilities.webdriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends webdriverSetup {

    Dashboard dashboard = new Dashboard();
    login login = new login();

    @Test
    public void LoginTest() throws InterruptedException {
        getBrowser().get("https://test.accounts.vector360bd.com/");
        Thread.sleep(3000);

        login.writeOnElement(login.phonenumber_box, "admin@gmail.com");
        login.writeOnElement(login.password_box, "123456");
        login.clickOnElement(login.loginBtn);
        Thread.sleep(3000);


    }
    @Test(dataProvider = "LogInInvalidData", dataProviderClass = DataSet.class)
    public void TestLogInInvalidData(String Scenario, String phone_number , String password) throws InterruptedException {
        getBrowser().get("https://test.accounts.vector360bd.com/");
        Thread.sleep(3000);
        login.writeOnElement(login.phonenumber_box, phone_number);
        login.writeOnElement(login.password_box, password);

        Thread.sleep(3000);
        login.clickOnElement(login.loginBtn);
        Thread.sleep(3000);

        if (Scenario.equalsIgnoreCase("blankFields")) {
            String errorMsgForBlankData = getBrowser().findElement(By.xpath("(//div[contains(text(),'Please input your phone number!')])[1]")).getText();
            Assert.assertEquals(errorMsgForBlankData, "\"phone number\" is not allowed to be empty");

        }else if (Scenario.equalsIgnoreCase("incorrectDataBoth")) {
            String errorMsgForIncorrectData = getBrowser().findElement(By.xpath("(//span[normalize-space()='User not found'])[1]")).getText();
            System.out.println(errorMsgForIncorrectData);
            Assert.assertEquals(errorMsgForIncorrectData, "User not found!");

        }else if (Scenario.equalsIgnoreCase("incorrectPhone")) {
            String errorMsgForIncorrectData = getBrowser().findElement(By.xpath("(//span[normalize-space()='User not found'])[1]")).getText();
            System.out.println(errorMsgForIncorrectData);
            Assert.assertEquals(errorMsgForIncorrectData, "User not found!");

        }else if (Scenario.equalsIgnoreCase("incorrectPassword")) {
            String errorMsgForIncorrectData=getBrowser().findElement(By.cssSelector("(//span[normalize-space()='User not found'])[1]")).getText();
            System.out.println(errorMsgForIncorrectData);
            Assert.assertEquals(errorMsgForIncorrectData,"Username or Password is incorrect,Please try again");



}}}