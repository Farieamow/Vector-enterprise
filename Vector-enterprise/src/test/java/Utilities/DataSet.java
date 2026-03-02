package Utilities;

import Pages.BasePage;
import Pages.login;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;

public class DataSet extends BasePage {
    login signUp = new login();

    @DataProvider(name = "LogInInvalidData")
    public static Object[] TestLogInData() {
        Object[][] data = {{"blankFields", "", ""},
                {"incorrectDataBoth", "01772978970", "124568"},
                {"incorrectUsername", "01772974972", "123456"},
                {"incorrectPassword", "admin@gmail.com", "123569"},


        };
        return data;


    }
}