import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;
import utilities.DriverManager;

public class LoginTests extends BaseTest{
    @Test @Ignore
    public void loginSuccessTest(){
        LoginPage loginPage = new LoginPage(DriverManager.getDriver().driver);
        loginPage.setUserNameTextBox("Admin");
        loginPage.setPasswordTextBox("admin123");
        loginPage.clickOnLoginButton();
        HomePage homepage= new HomePage(DriverManager.getDriver().driver);
        Assert.assertTrue(homepage.topBarIsDisplayed());
    }
    @Test
    public void isDisplayed(){
        LoginPage loginPage = new LoginPage(DriverManager.getDriver().driver);
        loginPage.setUserNameTextBox("Admin");
        loginPage.setPasswordTextBox("admin123");
        loginPage.clickOnLoginButton();
        HomePage homepage= new HomePage(DriverManager.getDriver().driver);
        homepage.setEmployeeID("0038");
        homepage.setSupervisorName("Odis Adalwin");
        homepage.clickOnSearchButton();
        Assert.assertTrue(homepage.employeeIsDisplayed());
    }
}
